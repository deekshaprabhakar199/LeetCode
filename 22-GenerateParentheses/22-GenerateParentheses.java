        if(open ==0 && close ==0){
            result.add(ans.toString());
        }
        if(open > 0){
            ans.append("(");
        }
            backtrack(ans,open-1, close);
            ans.deleteCharAt(ans.length()-1);
        if(open < close){
            ans.append(")");
            backtrack(ans, open, close-1);
            ans.deleteCharAt(ans.length()-1);
        }
    }
}
3
