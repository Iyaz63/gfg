// User function Template for Java

class Solution {
    public static int findUnion(int a[], int b[]) {
        // code here
        Set<Integer> unionSet = new HashSet<>();

        for (int num : a)
            unionSet.add(num);
        for (int num : b)
            unionSet.add(num);

        return unionSet.size();
    }
}