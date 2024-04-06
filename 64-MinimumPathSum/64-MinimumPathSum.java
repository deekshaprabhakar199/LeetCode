                if(j>0) left = dp[i][j-1];
                dp[i][j] = grid[i][j] + Math.min(up,left);
            }
        }
        return dp[m-1][n-1];
    }
}
                int up=Integer.MAX_VALUE, left =Integer.MAX_VALUE;
                if(i>0) up = dp[i-1][j];
                }
[
