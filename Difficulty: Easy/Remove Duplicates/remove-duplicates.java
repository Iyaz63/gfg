//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String s = read.readLine();

            Solution ob = new Solution();
            String result = ob.removeDups(s);

            System.out.println(result);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String removeDups(String s) {
        // code here
        String a=""+s.charAt(0);
        for(int i=1;i<s.length();i++){
            int max=0;
            for(int j=0;j<a.length();j++){
                if(s.charAt(i)==a.charAt(j)){
                    max=1;
                    break;
                }
            }
            if(max==0){
                a+=s.charAt(i);
            }
        }
        return a;
    }
}