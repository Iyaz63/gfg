//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.lang.*;
import java.util.*;


// } Driver Code Ends



class Solution {
    // Function to find the minimum number of swaps required to sort the array.
    public int minSwaps(int arr[]) {
        // Code here
         int n = arr.length;
        int ans = 0;

        // Pair each element with its index
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        // Sort by array values
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[0]));

        // Track visited elements
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            // already in correct place or visited
            if (visited[i] || pairs[i][1] == i)
                continue;

            int cycleSize = 0;
            int j = i;

            // Count the size of the cycle
            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j][1];
                cycleSize++;
            }

            if (cycleSize > 1) {
                ans += (cycleSize - 1);
            }
        }

        return ans;
    }
}


//{ Driver Code Starts.

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // int k = Integer.parseInt(br.readLine());
            String line = br.readLine();
            String[] tokens = line.split(" ");

            // Create an ArrayList to store the integers
            ArrayList<Integer> array = new ArrayList<>();

            // Parse the tokens into integers and add to the array
            for (String token : tokens) {
                array.add(Integer.parseInt(token));
            }

            int[] arr = new int[array.size()];
            int idx = 0;
            for (int i : array) arr[idx++] = i;
            Solution obj = new Solution();
            int ans = obj.minSwaps(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends