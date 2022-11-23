class Solution {
    public boolean isValidSudoku(char[][] board) {
    HashSet<String> seen = new HashSet<>();
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                char cur_val = board[i][j];
                if(cur_val != '.'){
                    if(!seen.add(cur_val + "found in row" + i) || !seen.add(cur_val + "found in col" + j) || 
                       !seen.add(cur_val + "found in sub box" + i/3 + "-" + j/3)){
                        return false;
                    } 
                }
            }
        }
        return true;
    }
}