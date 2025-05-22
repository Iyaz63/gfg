// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
         int n = arr.length;
        int index = 0; // Position to place the next non-zero element

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

        // Fill the rest with zeros
        while (index < n) {
            arr[index++] = 0;
        }
    
    }
}