        if( c== '.'){
        char c= word.charAt(index);
            for(TrieNode val: curr.child.values()){
                if(searchHelper(word, val, index+1)) return true;
            } 
            return false;
        }
        else{
            return curr.child.get(c) != null && searchHelper(word,curr.child.get(c), index+1);
        }
        //return false;
    }
}

/**
[
