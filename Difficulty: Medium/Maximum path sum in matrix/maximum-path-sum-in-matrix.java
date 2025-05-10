//{ Driver Code Starts
// Initial Template for Java
import java.util.*;

class gfg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), m = sc.nextInt();
            int[][] mat = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }
            Solution ob = new Solution();
            System.out.println(ob.maximumPath(mat));
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    public int maximumPath(int[][] mat) {
        // code here
         int n = mat.length;
        int m = mat[0].length;

        int[][] dp = new int[n][m];

        for (int j = 0; j < m; j++) {
            dp[0][j] = mat[0][j];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int up = dp[i - 1][j];
                int leftDiag = (j > 0) ? dp[i - 1][j - 1] : 0;
                int rightDiag = (j < m - 1) ? dp[i - 1][j + 1] : 0;

                dp[i][j] = mat[i][j] + Math.max(up, Math.max(leftDiag, rightDiag));
            }
        }

        int max = 0;
        for (int j = 0; j < m; j++) {
            max = Math.max(max, dp[n - 1][j]);
        }

        return max;
    }
}