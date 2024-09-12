class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int res=0;
        for(String st:words){
            int l=0;
            for(char ch:st.toCharArray()){
                if(allowed.indexOf(ch)!=-1) l++;
            }
            if(l==st.length()) res++;
        }
        return res;
    }
}