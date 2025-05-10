//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int x[] = new int[str.length];
            for (int i = 0; i < str.length; i++) x[i] = Integer.parseInt(str[i]);
            str = (br.readLine()).trim().split(" ");
            int[] y = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                y[i] = Integer.parseInt(str[i]);
            }
            System.out.println(new Solution().countPairs(x, y, x.length, y.length));
        }
    }
}

// } Driver Code Ends


//Back-end complete function Template for Java
class Solution {
    // Function to count number of pairs such that x^y is greater than y^x.
    public long countPairs(int x[], int y[], int M, int N) {
        // code here
         Arrays.sort(y);
        int[] freq = new int[5];
        for (int i = 0; i < N; i++) {
            if (y[i] < 5)
                freq[y[i]]++;
        }

        long totalPairs = 0;
        for (int i = 0; i < M; i++) {
            totalPairs += count(x[i], y, freq, N);
        }
        return totalPairs;
    }

    private long count(int x, int[] y, int[] freq, int N) {
        if (x == 0) return 0;
        if (x == 1) return freq[0];

        int idx = upperBound(y, x);
        long ans = N - idx;
        ans += freq[0] + freq[1];

        if (x == 2) {
            ans -= (freq[3] + freq[4]);
        }
        if (x == 3) {
            ans += freq[2];
        }
        return ans;
    }

    private int upperBound(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (arr[m] <= x) l = m + 1;
            else r = m;
        }
        return l;
        
    }
}