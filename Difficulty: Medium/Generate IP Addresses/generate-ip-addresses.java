//{ Driver Code Starts
import java.util.*;

class GenIP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            Solution sln = new Solution();
            ArrayList<String> str = sln.generateIp(s);
            Collections.sort(str);
            if (str.size() == 0)
                System.out.println(-1);
            else {
                for (String u : str) {
                    System.out.println(u);
                }
            }

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


/*complete the Function*/

class Solution {
    public ArrayList<String> generateIp(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        backtrack(s, 0, "", 0, result);
        return result;
    }

    private void backtrack(String s, int index, String path, int parts, ArrayList<String> result) {
        if (parts > 4) return;
        if (parts == 4 && index == s.length()) {
            result.add(path.substring(0, path.length() - 1));
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {
            String segment = s.substring(index, index + len);
            if (isValid(segment)) {
                backtrack(s, index + len, path + segment + ".", parts + 1, result);
            }
        }
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.startsWith("0")) return false;
        int val = Integer.parseInt(s);
        return val >= 0 && val <= 255;
        
    }
}