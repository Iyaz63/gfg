// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
         ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        int n = a.length, m = b.length;

        while (i < n && j < m) {
            if (a[i] < b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                    result.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != b[j])
                    result.add(b[j]);
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                    result.add(a[i]);
                i++;
                j++;
            }
        }

        // Add remaining elements
        while (i < n) {
            if (result.isEmpty() || result.get(result.size() - 1) != a[i])
                result.add(a[i]);
            i++;
        }

        while (j < m) {
            if (result.isEmpty() || result.get(result.size() - 1) != b[j])
                result.add(b[j]);
            j++;
        }

        return result;
    }
}
