class Solution {
    boolean isPalindrome(String s) {
        // code here
        int n=s.length();
        int j=n-1;
        int i=0;
        while(i<n/2){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;
        }
        return true;
    }
}