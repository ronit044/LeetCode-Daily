class Solution {
    public int maxVowels(String s, int k) {
        int l=s.length();
        int res=Integer.MIN_VALUE,count=0;
        for(int i=0;i<l;i++){
            char ch=s.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') count++;
            if(i+1>=k){
                if(i-k>=0){
                char chr=s.charAt(i-k);
                if(chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u') count--;
                }
                // System.out.println(ch+": "+count);
                res=Math.max(res,count);
            }
        }
        return res;
    }
}