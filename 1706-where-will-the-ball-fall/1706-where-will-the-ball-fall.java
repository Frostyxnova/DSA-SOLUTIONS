class Solution {
    public int[] findBall(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        int[] ans = new int[c];
        
        for (int i = 0; i < c; i++) 
            ans[i] = canReachEnd(grid, r, c, i);
        
        return ans;
    }
    
    public int canReachEnd(int[][] grid, int r, int c, int curr) {
        int i = 0, j = curr;
        
        while (i < r && j < c) {
            int nextJ = j + grid[i][j]; 
            
            if (nextJ < 0 || nextJ > c - 1 || grid[i][j] != grid[i][nextJ]) 
                return -1; 
                
            j = nextJ; // Going to next column
            i++; // Going to next row
        }
        
        return j;    
    }
}