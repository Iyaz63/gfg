class Solution {
    int minDist(int arr[], int x, int y) {
        // code here
        int n = arr.length;
        int minDist = Integer.MAX_VALUE;
        int prev = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != arr[prev]) {
                    minDist = Math.min(minDist, i - prev);
                }
                prev = i;
            }
        }

        return minDist == Integer.MAX_VALUE ? -1 : minDist;
    }
}