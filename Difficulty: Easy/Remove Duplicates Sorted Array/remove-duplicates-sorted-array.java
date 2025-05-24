class Solution {
    // Function to remove duplicates from the given array
    public int removeDuplicates(int[] arr) {
        // Code Here
        int n = arr.length;
        if (n == 0) return 0;
        
        int index = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[index - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}