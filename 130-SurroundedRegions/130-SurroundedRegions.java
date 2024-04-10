                    board[i][j] = 'X';
                }
                else if(board[i][j] =='C'){
                    board[i][j] = 'O';
                }
            }
        }
    }

    public void dfs(char[][] board, int i, int j){
        if(i<0 || j<0 || i>= board.length || j>= board[0].length || board[i][j] != 'O'){
            return;
        }
[
