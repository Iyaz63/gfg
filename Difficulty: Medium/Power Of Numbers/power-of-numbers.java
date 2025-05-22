// User function Template for Java

class Solution {
    public int reverseExponentiation(int n) {
        // code here
        int rev = reverse(n);
        return (int) Math.pow(n, rev);
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }
        return rev;
    }
}
