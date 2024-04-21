    }
    public void dfs(int row, int col, char[][] board){
        if(row<0 || col<0 || row>=board.length || col >= board[0].length || board[row][col] != 'O'){
            return;
        }
        board[row][col]='C';
        dfs(row+1,col,board);
        dfs(row-1, col, board);
        dfs(row, col+1, board);
        dfs(row, col-1, board);
    }
}
        }
            }
                }
                    board[i][j]='O';
[
