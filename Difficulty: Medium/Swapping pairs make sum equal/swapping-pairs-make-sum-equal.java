//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int[] b = new int[nk.length];
            for (int i = 0; i < nk.length; i++) {
                b[i] = Integer.parseInt(nk[i]);
            }
            Solution sln = new Solution();
            boolean ans = sln.findSwapValues(a, b);
            if (ans) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
            // System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    boolean findSwapValues(int[] a, int[] b) {
        // Your code goes here
         int sumA = 0, sumB = 0;
        for (int num : a) sumA += num;
        for (int num : b) sumB += num;

        int diff = sumA - sumB;
        if (diff % 2 != 0) return false;

        int target = diff / 2;

        // Store b[] in a set for quick lookup
        Set<Integer> setB = new HashSet<>();
        for (int num : b) setB.add(num);

        for (int x : a) {
            int y = x - target;
            if (setB.contains(y)) return true;
        }

        return false;
    }
}
