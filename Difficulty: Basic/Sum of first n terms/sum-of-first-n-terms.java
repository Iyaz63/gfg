// User function Template for Java

class Solution {
    int sumOfSeries(int n) {
        // code here
        int sum=1;
        for(int i=2;i<=n;i++){
            sum+=i*i*i;
        }
        return sum;
    }
}