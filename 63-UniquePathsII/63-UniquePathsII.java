                right--;
            }
            else if(f==2){
                for(int i=right;i>=left;i--){
                    ls.add(arr[down][i]);
                }
                f=3;
                down--;
            }
            else if(f==3){
                for(int i=down;i>=up;i--){
                    ls.add(arr[i][left]);
                }
                f=0;
                left++;
            }
        }
        return ls;

        
    }
}
[
