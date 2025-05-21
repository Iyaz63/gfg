// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
        // Code Here
         List<Integer> result = new ArrayList<>();
        int i = 0, j = 0, k = 0;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a = arr1.get(i), b = arr2.get(j), c = arr3.get(k);

            if (a == b && b == c) {
                if (result.isEmpty() || result.get(result.size() - 1) != a)
                    result.add(a);
                i++; j++; k++;
            } else {
                int minVal = Math.min(a, Math.min(b, c));
                if (a == minVal) i++;
                if (b == minVal) j++;
                if (c == minVal) k++;
            }
        }

        return result;
    }
}