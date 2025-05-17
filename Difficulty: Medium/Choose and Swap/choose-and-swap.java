//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {

        Solution obj = new Solution();
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String A = read.readLine().trim();

            String ans = obj.chooseandswap(A);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {

    String chooseandswap(String str) {
        // Code Here
         char[] arr = str.toCharArray();
        boolean[] seen = new boolean[26];

        for (char c : arr) seen[c - 'a'] = true;

        for (int i = 0; i < arr.length; i++) {
            for (char ch = 'a'; ch < arr[i]; ch++) {
                if (seen[ch - 'a']) {
                    char c1 = arr[i];
                    char c2 = ch;

                    for (int j = 0; j < arr.length; j++) {
                        if (arr[j] == c1) arr[j] = c2;
                        else if (arr[j] == c2) arr[j] = c1;
                    }

                    return new String(arr);
                }
            }
            seen[arr[i] - 'a'] = false;
        }

        return str;
        
    }
}