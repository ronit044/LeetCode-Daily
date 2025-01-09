class Solution {
    public int prefixCount(String[] words, String pref) {
        int res=0;
        for(String st:words) if(st.startsWith(pref)) res++;
        return res;
    }
}