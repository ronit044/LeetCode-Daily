class Solution {
    List<String> res=new ArrayList<>();
    public void helper(StringBuilder st,int open,int close,int n){
        if(open>2*n) return;
        if(st.length()==2*n){
            res.add(st.toString());
            return;
        }
        if(open<n){
            helper(new StringBuilder(st).append('('),open+1,close,n);
        }
        if(close<open){
            helper(new StringBuilder(st).append(')'),open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        helper(new StringBuilder(""),0,0,n);
        return res;
    }
}