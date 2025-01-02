class Solution {
    public boolean isVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
    public int[] vowelStrings(String[] words, int[][] queries) {
        int ql=queries.length,wl=words.length;
        int res[]=new int[ql];
        int prefix[]=new int[wl];
        int accm=isVowel(words[0].charAt(0)) && isVowel(words[0].charAt(words[0].length()-1))?1:0;
        prefix[0]=accm;
        for(int i=1;i<wl;i++){
            if(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))){
                accm++;
            }
            prefix[i]=accm;
        }
        for(int i=0;i<ql;i++){
            if(queries[i][1]==queries[i][0]){ 
                res[i]=isVowel(words[queries[i][1]].charAt(0)) && isVowel(words[queries[i][1]].charAt(words[queries[i][1]].length()-1))?1:0;
                continue; 
            }
            res[i]=prefix[queries[i][1]]-(queries[i][0]>0?prefix[queries[i][0]-1]:0);
        }
        return res;
    }
}