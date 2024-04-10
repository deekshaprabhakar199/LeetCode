                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        
        return dp[l1][l2];
    }
}
            dp[0][j]=0;
        }

        for( int i=1; i<=l1; i++){
            for( int j=1; j<=l2; j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
"
