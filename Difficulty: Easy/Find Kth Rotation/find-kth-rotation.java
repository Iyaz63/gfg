// User function Template for Java

class Solution {
    public int findKRotation(List<Integer> arr) {
        // Code here
        int min=Integer.MAX_VALUE;
        int k=0;
        for(int i=0;i<arr.size();i++){
            if(arr.get(i)<min){
                min=arr.get(i);
                k=i;
            }
        }
        return k%arr.size();
    }
}