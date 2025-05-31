// User function Template for Java

class Solution {
    // Function to search a given integer in a matrix.
    public boolean searchMatrix(int[][] matrix, int x) {
        // code here
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
