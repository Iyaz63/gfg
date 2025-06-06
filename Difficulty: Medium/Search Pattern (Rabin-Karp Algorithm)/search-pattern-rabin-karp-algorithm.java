class Solution {
    ArrayList<Integer> search(String pat, String txt) {
        // Code here
        ArrayList<Integer> result = new ArrayList<>();
        int M = pat.length();
        int N = txt.length();

        // Compute LPS array
        int[] lps = new int[M];
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]
        int j = 0; // index for pat[]
        while (i < N) {
            if (pat.charAt(j) == txt.charAt(i)) {
                i++;
                j++;
            }
            if (j == M) {
                result.add(i - j + 1); // 1-based indexing
                j = lps[j - 1];
            } else if (i < N && pat.charAt(j) != txt.charAt(i)) {
                if (j != 0)
                    j = lps[j - 1];
                else
                    i++;
            }
        }
        return result;
    }

    void computeLPSArray(String pat, int M, int[] lps) {
        int len = 0;
        lps[0] = 0; // lps[0] is always 0
        int i = 1;
        while (i < M) {
            if (pat.charAt(i) == pat.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
    }
}