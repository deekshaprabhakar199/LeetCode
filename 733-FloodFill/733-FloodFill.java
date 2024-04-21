        }
    }

    public void dfs(int[][] image, int row, int col, int color, int start){
        if(row < 0 || col <0 || row >= image.length || col >= image[0].length || image[row][col] != start ){
            return;
        }
        image[row][col] = color;

        dfs(image, row+1, col, color, start);
        dfs(image, row-1, col, color, start);
        dfs(image, row, col+1, color, start);
        dfs(image, row, col-1, color, start);
    }
}
[
