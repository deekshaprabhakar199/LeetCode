
            }
        }
                else{
                    mat[i][j]= m*n;
                }
                if(mat[i][j]==0){
                    bfs.offer(new int[]{i,j});
                }
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Queue<int[]> bfs = new LinkedList<>();

        for(int i=0; i<m; i++){
            for (int j=0; j<n; j++){
[
