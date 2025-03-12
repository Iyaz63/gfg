//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends

// User function template for JAVA

class Solution {
    // Function to find the minimum indexed character.
    public static int minIndexChar(String s1, String s2) {
       boolean[] present = new boolean[256];

    for (char ch : s2.toCharArray()) {
        present[ch] = true;
    }

    int min = Integer.MAX_VALUE;

    for (int i = 0; i < s1.length(); i++) {
        if (present[s1.charAt(i)]) {
            min = Math.min(min, i);
        }
    }

    return (min == Integer.MAX_VALUE) ? -1 : min;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            t--;

            String s1 = sc.next();
            String s2 = sc.next();

            int res = new Solution().minIndexChar(s1, s2);
            System.out.println(res);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends