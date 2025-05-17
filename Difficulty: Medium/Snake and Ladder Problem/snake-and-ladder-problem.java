//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String a[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[2*N];
            for(int i = 0;i < 2*N;i++)
                arr[i] = Integer.parseInt(a[i]);
            
            Solution ob = new Solution();
            System.out.println(ob.minThrow(N, arr));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    static int minThrow(int N, int arr[]) {
        // code here
         int moves[] = new int[31]; // board size fixed at 30 (common snake-ladder size)
        Arrays.fill(moves, -1);

        // arr contains pairs for snakes/ladders start -> end
        for (int i = 0; i < N * 2; i += 2) {
            moves[arr[i]] = arr[i + 1];
        }

        boolean[] visited = new boolean[31];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(1);
        visited[1] = true;

        int throwsCount = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            throwsCount++;

            for (int i = 0; i < size; i++) {
                int curr = queue.poll();

                for (int dice = 1; dice <= 6; dice++) {
                    int next = curr + dice;
                    if (next > 30) continue;

                    if (moves[next] != -1) {
                        next = moves[next];
                    }

                    if (next == 30) return throwsCount;

                    if (!visited[next]) {
                        visited[next] = true;
                        queue.add(next);
                    }
                }
            }
        }

        return -1; 
    }
}