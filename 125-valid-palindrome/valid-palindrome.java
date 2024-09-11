class Solution {
    public boolean isPalindrome(String s) {
        String st="",rev="";
        for(char ch:s.toCharArray()){
            if(!Character.isDigit(ch) && !Character.isLetter(ch)) continue;
            st+=Character.toLowerCase(ch);
            rev=Character.toLowerCase(ch)+rev;
        }
        if(st.equals(rev)) return true;
        return false;
    }
}