class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            arr[i]--;
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % n < n) {
                arr[arr[i] % n] += n;
            }
        }

        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(arr[i] / n);
        }

        return res;
    }
}
