class Solution {
    public boolean isValid(String s) {
        Stack<Character> vp = new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='('){
                vp.push(')');
            }
            else if(ch=='{'){
                vp.push('}');
            }
            else if(ch=='['){
                vp.push(']');
            }
            else if(vp.isEmpty() || ch!=vp.pop()){
                return false;
            }
        }
        return vp.isEmpty();
    }
}