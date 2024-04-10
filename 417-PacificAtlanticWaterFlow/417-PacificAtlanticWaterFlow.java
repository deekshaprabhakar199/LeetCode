    public void dfs (boolean[][] ocean, int i, int j, int[][] heights, int prevHeight){
        if(i<0 || j<0 || i>=heights.length || j>= heights[0].length || heights[i][j] < prevHeight || ocean[i][j]){
            return;
        }
        ocean[i][j] = true;

        dfs(ocean, i+1, j, heights, heights[i][j]);
        dfs(ocean, i-1, j, heights, heights[i][j]);

    }
        return result;
        }
            }
[
