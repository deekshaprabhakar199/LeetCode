            for(int i=0; i< level; i++){
                if(bfs.peek().left != null) bfs.offer(bfs.peek().left);
                if(bfs.peek().right != null) bfs.offer(bfs.peek().right);
                last = bfs.poll().val;
            }
            right.add(last);
        }
        return right;
    }
}
[
