            if(!visited[i]){
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }

    public void dfs(int curr, int[][] isConnected, boolean[] visited){
        visited[curr]= true;
        for( int i=0; i< isConnected[curr].length; i++){
            if(!visited[i] && isConnected[curr][i]==1){
                dfs(i, isConnected, visited);
            }
        }
[
