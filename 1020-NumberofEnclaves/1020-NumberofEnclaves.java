        }
        return count;
    }

            }
                }
    public void dfs(int row, int col, int[][] grid){
        if(row<0 || col<0 || row>=grid.length || col >= grid[0].length || grid[row][col] != 1){
            return;
        }

        grid[row][col]=2;

        dfs(row+1,col, grid);
        dfs(row-1, col, grid);
        dfs(row, col+1, grid);
[
