//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

class Solution {
    public static int countBitsFlip(int a, int b) {
        // code here
         return Integer.bitCount(a ^ b);
    }
}



//{ Driver Code Starts.

// Driver class
class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // testcases
        int m, n;
        long ans = 0; // initialise ans to 0
        while (t-- > 0) {

            // input m and n
            m = sc.nextInt();
            n = sc.nextInt();
            Solution obj = new Solution();
            System.out.println(obj.countBitsFlip(m, n));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends