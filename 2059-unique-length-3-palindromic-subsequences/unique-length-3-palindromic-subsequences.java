class Solution {
    public int countPalindromicSubsequence(String s) {
        int l=s.length(),res=0;
        // HashMap<String,String> hm=new HashMap<>();
        HashSet<Character> ht2=new HashSet<>();
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ht2.contains(ch)) continue;
            int lastInd=s.lastIndexOf(ch);
            if(lastInd==-1){
                continue;
            }
            HashSet<Character> ht=new HashSet<>();
            for(int j=i+1;j<lastInd;j++){
                ht.add(s.charAt(j));
            }
            res+=ht.size();
            ht2.add(ch);
        }
        return res;
    }
}