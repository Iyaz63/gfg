// User function Template for Java

class Solution {
    public static ArrayList<Integer> factorial(int n) {
        // code here
         ArrayList<Integer> res = new ArrayList<>();
        res.add(1);

        for (int x = 2; x <= n; x++) {
            int carry = 0;
            for (int i = 0; i < res.size(); i++) {
                int val = res.get(i) * x + carry;
                res.set(i, val % 10);
                carry = val / 10;
            }
            while (carry != 0) {
                res.add(carry % 10);
                carry /= 10;
            }
        }

        // The result is stored in reverse order
        Collections.reverse(res);
        return res;
    }
}