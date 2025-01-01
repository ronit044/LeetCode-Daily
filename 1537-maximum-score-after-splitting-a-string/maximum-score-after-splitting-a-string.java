class Solution {
    public int maxScore(String s) {
        int ones=0,zeroes=0,ans=Integer.MIN_VALUE;
        for(char ch:s.toCharArray()) if(ch=='1')ones++;
        for(int i=0;i<s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch=='1') ones--;
            else zeroes++;
            ans=Math.max(ans,ones+zeroes);
        }
        return ans;
    }
}