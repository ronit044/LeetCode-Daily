class Solution {
    public boolean func(String str1,String str2){
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
    public int countPrefixSuffixPairs(String[] words) {
        int l=words.length,res=0;
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(func(words[i],words[j])) res++;
            }
        }
        return res;
    }
}