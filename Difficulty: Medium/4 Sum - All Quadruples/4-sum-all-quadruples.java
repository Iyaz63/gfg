//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {
            // String[] nk = br.readLine().trim().split(" ");
            // int n = Integer.parseInt(nk[0]);
            // int k = Integer.parseInt(nk[1]);

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int target = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            List<List<Integer>> ans = ans = sln.fourSum(a, target);
            Collections.sort(ans, (list1, list2) -> {
                for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
                    int cmp = list1.get(i).compareTo(list2.get(i));
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return 0;
            });
            for (List<Integer> v : ans) {
                for (int x : v) {
                    System.out.print(x + " ");
                }
                System.out.println();
            }
            if (ans.isEmpty()) {
                System.out.println(-1);
            }
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

// arr[] : int input array of integers
// target : the quadruple sum required

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        // code here
         Arrays.sort(arr);
        int n = arr.length;
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {
            for (int j = i + 1; j < n - 2; j++) {
                int k = j + 1, l = n - 1;
                while (k < l) {
                    long sum = (long) arr[i] + arr[j] + arr[k] + arr[l];
                    if (sum == target) {
                        List<Integer> quad = Arrays.asList(arr[i], arr[j], arr[k], arr[l]);
                        result.add(quad);
                        k++;
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        List<List<Integer>> ans = new ArrayList<>(result);
        ans.sort((a, b) -> {
            for (int i = 0; i < 4; i++) {
                if (!a.get(i).equals(b.get(i))) return a.get(i) - b.get(i);
            }
            return 0;
        });

        return ans;
    }
}