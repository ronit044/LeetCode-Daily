class Solution {
    public boolean validate(String p){
        Stack<Character> st=new Stack<>();
        for(char ch:p.toCharArray()){
            if(ch=='(') st.push(ch);
            else{
                if(st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }
    List<String> res=new ArrayList<>();
    public void generate(String st, int open, int close, int n)
    {
        if(st.length() > 2 * n ) {
            return;
        }
        if(st.length() == 2 * n && validate(st)){
            res.add(st); return;
        }
        if(open < n) {
            generate(st + "(", open + 1, close, n);
        }
        if(close < open) {
            generate(st + ")", open, close + 1, n);
        }
    }
    public List<String> generateParenthesis(int n) {
        generate("",0,0,n);
        return res;
    }
}