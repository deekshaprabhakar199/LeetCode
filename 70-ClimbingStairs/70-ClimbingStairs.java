
    public int count(int n, int[] ans){
        if(n<2) {
        if(ans[n] != -1){
            return ans[n];
        }
        return ans[n] = count(n-1,ans)+count(n-2,ans) + 1;
            return ans[n]=n;
        }
    }
}
    }
        return count(n-1,ans)+1;
        Arrays.fill(ans,-1);
        int[] ans= new int[n];
2
