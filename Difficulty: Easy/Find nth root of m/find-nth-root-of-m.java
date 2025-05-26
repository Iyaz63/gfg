// User function Template for Java

class Solution {
    public int nthRoot(int n, int m) {
        // code here
        int low = 1, high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int pow = (int)Math.pow(mid, n);
            
            if (pow == m) return mid;
            else if (pow < m) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
}