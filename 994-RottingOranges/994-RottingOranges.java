    }
    public void dfs( int row, int col, int[][]grid, int minutes){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || grid[row][col]==0 || (1< grid[row][col] && grid[row][col] < minutes)){
            return;
        }
        grid[row][col] = minutes;

        dfs(row+1, col, grid, minutes+1);
        dfs(row-1, col, grid, minutes+1);
        dfs(row, col+1, grid, minutes+1);
        dfs(row, col-1, grid, minutes+1);
    }
        return minutes-2;
        }
            }
                minutes = Math.max(minutes, grid[i][j]);
                }
                    return -1;
[
