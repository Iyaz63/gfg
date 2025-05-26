class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        // Your code here
        Arrays.sort(arr);
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=arr.length-1;i>arr.length-1-k;i--){
            a.add(arr[i]);
        }
        return a;
    }
}
