// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
         int n = arr.length;
        int repeat = -1, missing = -1;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                repeat = Math.abs(arr[i]);
            } else {
                arr[index] = -arr[index];
            }
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                missing = i + 1;
                break;
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeat);
        res.add(missing);
        return res;
    }
}
