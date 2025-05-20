class Solution {

    static int findFloor(int[] arr, int x) {
        // write code here
         int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] <= x) {
                ans = mid;      // valid floor candidate
                low = mid + 1;  // move right to find last such index
            } else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
