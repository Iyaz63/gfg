class Solution {
    public static int numberofElementsInIntersection(int a[], int b[]) {
        // Your code here
         Set<Integer> setA = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        for (int num : a) {
            setA.add(num);
        }

        for (int num : b) {
            if (setA.contains(num)) {
                intersection.add(num);
            }
        }

        return intersection.size();
    }
}