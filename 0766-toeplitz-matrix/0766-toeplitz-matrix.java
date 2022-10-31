class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
       int rows = matrix.length;
        int cols = matrix[0].length;
        
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                if (matrix[i + 1][j + 1] != matrix[i][j]) {    // matching the lower row with upper row 
															   // i.e., comparing lower element with the upper left element
															   // in each row 
                    return false;
                }
            }
        }
        return true;    
    }
}