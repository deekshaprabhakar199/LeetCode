            switch(s.charAt(i)){
        }
                case '(' : parenthesis.push(')'); break;
            }
    }
                case '{' : parenthesis.push('}'); break;
                case '[' : parenthesis.push(']'); break;
                case ')' : case ']' : case '}' : if(parenthesis.isEmpty() || parenthesis.pop() != s.charAt(i)) return false;
        return (parenthesis.isEmpty());
}
        for( int i=0; i< s.length() ; i++){
        Stack<Character> parenthesis = new Stack<>();
class Solution {
    public boolean isValid(String s) {
"
