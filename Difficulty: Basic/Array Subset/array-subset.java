//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine().trim());
        while (t-- > 0) {
            String line = read.readLine().trim();
            String[] numsStr = line.split(" ");
            int[] a = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                a[i] = Integer.parseInt(numsStr[i]);
            }
            line = read.readLine().trim();
            numsStr = line.split(" ");
            int[] b = new int[numsStr.length];
            for (int i = 0; i < numsStr.length; i++) {
                b[i] = Integer.parseInt(numsStr[i]);
            }
            Solution ob = new Solution();
            if (ob.isSubset(a, b))
                System.out.println("true");
            else
                System.out.println("false");
            System.out.println("~");
        }
    }
}

// } Driver Code Ends



class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
         HashMap<Integer, Integer> freq = new HashMap<>();
    for (int num : a) {
        freq.put(num, freq.getOrDefault(num, 0) + 1);
    }

    for (int num : b) {
        if (!freq.containsKey(num) || freq.get(num) == 0) {
            return false;
        }
        freq.put(num, freq.get(num) - 1);
    }

    return true;
    }
}
