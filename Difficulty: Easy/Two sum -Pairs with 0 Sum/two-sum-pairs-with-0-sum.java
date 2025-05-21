// User function Template for Java

class Solution {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // code here
         Set<Integer> seen = new HashSet<>();
        Set<String> added = new HashSet<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        for (int num : arr) {
            if (seen.contains(-num)) {
                int a = Math.min(num, -num);
                int b = Math.max(num, -num);
                String key = a + "," + b;

                if (!added.contains(key)) {
                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(a);
                    pair.add(b);
                    result.add(pair);
                    added.add(key);
                }
            }
            seen.add(num);
        }

        // Sort each pair (already sorted due to min/max) and then sort the full list
        result.sort((p1, p2) -> {
            if (!p1.get(0).equals(p2.get(0)))
                return p1.get(0) - p2.get(0);
            return p1.get(1) - p2.get(1);
        });

        return result;
    }
}
