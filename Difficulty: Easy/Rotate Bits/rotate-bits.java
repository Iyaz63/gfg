//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int d = sc.nextInt();

            Solution ob = new Solution();

            ArrayList<Integer> res = ob.rotate(n, d);
            System.out.print(res.get(0) + " ");
            // System.out.println(res.get(0));
            System.out.println(res.get(1));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {

    ArrayList<Integer> rotate(int N, int D) {
        // your code here
          final int MASK = 0xFFFF;
        D = D % 16;

        int leftRotation = ((N << D) & MASK) | (N >> (16 - D));
        int rightRotation = (N >> D) | ((N << (16 - D)) & MASK);

        ArrayList<Integer> result = new ArrayList<>();
        result.add(leftRotation);
        result.add(rightRotation);
        return result;
    }
}