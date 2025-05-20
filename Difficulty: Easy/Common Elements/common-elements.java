// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        // Your code here
         Map<Integer, Integer> freqA = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        // Count frequency of elements in array a
        for (int num : a) {
            freqA.put(num, freqA.getOrDefault(num, 0) + 1);
        }

        // Find common elements with respect to frequency
        for (int num : b) {
            if (freqA.getOrDefault(num, 0) > 0) {
                result.add(num);
                freqA.put(num, freqA.get(num) - 1);
            }
        }

        // Sort the result
        Collections.sort(result);
        return result;
    }
}