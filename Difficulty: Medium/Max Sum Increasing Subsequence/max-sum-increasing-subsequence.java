//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GfG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t-- > 0) {
            String temp[] = sc.nextLine().trim().split(" ");
            int n = temp.length;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(temp[i]);
            Solution ob = new Solution();
            System.out.println(ob.maxSumIS(arr));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public int maxSumIS(int arr[]) {
        // code here.
         int n = arr.length;
        int[] dp = new int[n];
        System.arraycopy(arr, 0, dp, 0, n);  // Initialize dp with arr values

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + arr[i]);
                }
            }
        }

        int max = 0;
        for (int val : dp) {
            max = Math.max(max, val);
        }

        return max;
        
    }
}