                if(nrow >=0 && ncol >=0 && nrow < rows && ncol < cols && visited[nrow][ncol] == 0 && grid[nrow][ncol] ==1){
                    bfs.add(new Pair(nrow, ncol, time+1));
                    visited[nrow][ncol] =2;
                    converted++;
                }
            }
        }
        if(fresh != converted) return -1;

                int ncol = rcol + dcol[i];
                int nrow = rrow + drow[i];
            for(int i=0; i<4; i++){

            bfs.remove();
            tm = Math.max(tm,time);
            int time = bfs.peek().t;
            int rcol = bfs.peek().col;
            int rrow = bfs.peek().row;
[
