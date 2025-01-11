class Solution {
    public boolean canConstruct(String s, int k) {
        if(s.length()<k) return false;
        int []freq=new int[26];
        for(char ch:s.toCharArray()) freq[ch-'a']++;
        int oddFreq=0;
        for(int i=0;i<26;i++) oddFreq+=(freq[i]&1)!=0?1:0;
        return oddFreq>k?false:true;
    }
}
// a 2
// n 2
// b 1
// e 2
// l 2