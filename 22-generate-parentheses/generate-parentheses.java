class Solution {
    List<String> res=new ArrayList<>();
    public void generate(String st, int open, int close, int n)
    {
        if(st.length() > 2 * n ) {
            return;
        }
        if(st.length() == 2 * n){
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