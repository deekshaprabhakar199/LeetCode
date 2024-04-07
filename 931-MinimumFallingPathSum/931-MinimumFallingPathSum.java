                down = matrix[i][j] + dp[i-1][j];
                if(j<n-1) right = matrix[i][j] + dp[i-1][j+1];
                dp[i][j] = Math.min(left, Math.min(down, right));
            }
        }
                if(j>0) left = matrix[i][j] + dp[i-1][j-1];
                int left=Integer.MAX_VALUE, down = Integer.MAX_VALUE, right = Integer.MAX_VALUE;
            for (int j=0; j<n; j++){
        int min = Integer.MAX_VALUE;
        for( int i=1; i<m; i++){

[
