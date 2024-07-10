class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        for(String x:logs){
            if(x.equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }
            else if(x.equals("./")) continue;
            else{
                st.push(x);
            }
        }
        return st.size();
    }
}