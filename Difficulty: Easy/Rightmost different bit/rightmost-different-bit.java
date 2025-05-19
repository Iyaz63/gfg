//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.util.*;

class Main {

    public static void main(String[] args) throws NumberFormatException, IOException {
        Scanner sc = new Scanner(System.in);

        // input number of testcases
        int t = sc.nextInt();
        int m, n;
        while (t-- > 0) {
            Solution obj = new Solution();
            // input m and n
            m = sc.nextInt();
            n = sc.nextInt();
            System.out.println(obj.posOfRightMostDiffBit(m, n));

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    // Function to find the first position with different bits.
    public static int posOfRightMostDiffBit(int m, int n) {

        // Your code here
         int xor = m ^ n;
        if (xor == 0) return -1;
        int position = 1;
        while ((xor & 1) == 0) {
            xor >>= 1;
            position++;
        }
        return position;
    }
}
