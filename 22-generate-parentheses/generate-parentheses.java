class Solution {
    List<String> res=new ArrayList<>();
    public void helper(String st,int open,int close,int n){
        if(open>2*n) return;
        if(st.length()==2*n){
            res.add(st);
            return;
        }
        if(open<n){
            helper(st+'(',open+1,close,n);
        }
        if(close<open){
            helper(st+')',open,close+1,n);
        }
    }
    public List<String> generateParenthesis(int n) {
        helper("",0,0,n);
        return res;
    }
}