        if( c== '.'){
            for(TrieNode val: curr.child.values()){
        }
        else{
            return curr.child.get(c) != null && searchHelper(word,curr.child.get(c), index+1);
        }
                return searchHelper(word, val, index+1);
            }
        return false;
        char c= word.charAt(index);
    }
}
        }
            return curr.isWord;
        if(index == word.length()){
    public boolean searchHelper(String word, TrieNode curr, int index){
    }
        return searchHelper(word,root, 0);
    public boolean search(String word) {
    
[
