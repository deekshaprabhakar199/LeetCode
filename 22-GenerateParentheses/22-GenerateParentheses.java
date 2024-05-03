    public void backtrack(StringBuilder ans, int open, int close){
        if(open == 0 && close ==0){
            result.add(ans.toString());
        }
        if(open>0){
            ans.append("(");
        }
            backtrack(ans, open-1, close);
            ans.deleteCharAt(ans.length()-1);
        if(close > open){
            ans.append(")");
            backtrack(ans, open, close-1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
3
