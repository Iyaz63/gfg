//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            
            int n = Integer.parseInt(S[0]);
            int l = Integer.parseInt(S[1]);
            int r = Integer.parseInt(S[2]);

            Solution ob = new Solution();
            System.out.println(ob.toggleBits(n,l,r));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int toggleBits(int n, int l, int r) {
        // code here
         int maskLength = r - l + 1;
        int mask = ((1 << maskLength) - 1) << (l - 1);
        return n ^ mask;
    }
};