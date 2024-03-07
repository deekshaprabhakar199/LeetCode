        return (valid.isEmpty());// Case- (,{,[
    }
}
                case ')': case '}': case ']': if(valid.isEmpty() || valid.pop() != s.charAt(i)) return false;
            }
        }
       

 
                case '[': valid.push(']'); break;
        Stack<Character> valid = new Stack<>();
        for(int i=0; i<s.length(); i++){
            switch (s.charAt(i)){
                case '(': valid.push(')'); break;
                case '{': valid.push('}'); break;
        //Shorter Solution-
    public boolean isValid(String s) {
"
