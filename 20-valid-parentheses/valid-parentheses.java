class Solution {
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch=='(' ||ch=='{' ||ch=='[') st.add(ch);
            else{
                if(st.isEmpty()) return false;
                else if(ch==')' && st.peek()!='(') return false;
                else if(ch==']' && st.peek()!='[') return false;
                else if(ch=='}' && st.peek()!='{') return false;
                else st.pop();
            }
        }

        return st.isEmpty()?true:false;
    }
}