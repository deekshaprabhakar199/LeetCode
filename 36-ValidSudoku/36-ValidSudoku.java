class Solution {
    public boolean isValidSudoku(char[][] board) {
        for( int i=0; i< board.length; i++){
            for(int j=0; j< board[0].length; j++){
        }
            }
        HashSet<String> unique = new HashSet<>();
        return true;
                if(board[i][j] != '.'){
                    if(!unique.add("Row"+i+board[i][j]) || !unique.add("Col"+j+board[i][j]) || !unique.add("Grid"+i/3+j/3+board[i][j])){
                }
                        return false;
                    }
    }
[
