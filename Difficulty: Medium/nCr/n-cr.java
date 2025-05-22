class Solution {
    static final int MOD = 1000000007;

    public int nCr(int n, int r) {
        if (r > n) return 0;
        long[] fact = new long[n + 1];
        fact[0] = 1;

        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }

        long numerator = fact[n];
        long denominator = (fact[r] * fact[n - r]) % MOD;

        return (int)((numerator * modInverse(denominator, MOD)) % MOD);
    }

    // Fermat's Little Theorem for mod inverse
    long modInverse(long a, int mod) {
        return power(a, mod - 2, mod);
    }

    long power(long x, int y, int mod) {
        long res = 1;
        x = x % mod;

        while (y > 0) {
            if ((y & 1) == 1)
                res = (res * x) % mod;
            y = y >> 1;
            x = (x * x) % mod;
        }

        return res;
    }
}