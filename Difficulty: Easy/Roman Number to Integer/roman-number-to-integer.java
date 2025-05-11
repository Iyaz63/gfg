//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String s = br.readLine().trim();
            Solution ob = new Solution();
            System.out.println(ob.romanToDecimal(s));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
         Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        
        // Iterate through the string and compute the result
        for (int i = 0; i < s.length(); i++) {
            int current = romanMap.get(s.charAt(i));
            
            // Check if next character is larger (e.g., IV or IX)
            if (i + 1 < s.length() && current < romanMap.get(s.charAt(i + 1))) {
                result -= current;  // Subtract the current value (e.g., 1 from 4)
            } else {
                result += current;  // Otherwise, just add the value
            }
        }
        
        return result;
    }
}