//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends


class Solution {
  public:
    // Function to count the number of ways in which frog can reach the top.
    int countWays(int n) {

        // your code here
         const int MOD = 1e9 + 7;
        if (n == 0 || n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 1, c = 2;
        for (int i = 3; i <= n; ++i) {
            int temp = ((a + b) % MOD + c) % MOD;
            a = b;
            b = c;
            c = temp;
        }
        return c;
    }
};



//{ Driver Code Starts.
int main() {
    // taking testcases
    int t;
    cin >> t;

    while (t--) {
        // taking number of steps in stair
        int n;
        cin >> n;
        Solution ob;
        // calling function countWays()
        cout << ob.countWays(n) << endl;

        cout << "~"
             << "\n";
    }

    return 0;
}

// } Driver Code Ends