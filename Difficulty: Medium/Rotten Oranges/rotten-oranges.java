//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int mat[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) mat[i][j] = sc.nextInt();
            }
            Solution obj = new Solution();
            int ans = obj.orangesRotting(mat);
            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {
    public int orangesRotting(int[][] mat) {
        // Code here
        int rows = mat.length, cols = mat[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0;

        // Add all rotten oranges to the queue and count fresh ones
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (mat[i][j] == 1) {
                    fresh++;
                }
            }
        }

        if (fresh == 0) return 0; // No fresh oranges to rot

        int time = 0;
        int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;

            for (int i = 0; i < size; i++) {
                int[] cell = queue.poll();
                int x = cell[0], y = cell[1];

                for (int[] dir : directions) {
                    int nx = x + dir[0], ny = y + dir[1];
                    if (nx >= 0 && ny >= 0 && nx < rows && ny < cols && mat[nx][ny] == 1) {
                        mat[nx][ny] = 2;
                        queue.offer(new int[]{nx, ny});
                        fresh--;
                        rotted = true;
                    }
                }
            }

            if (rotted) time++;
        }

        return fresh == 0 ? time : -1;
    }
}