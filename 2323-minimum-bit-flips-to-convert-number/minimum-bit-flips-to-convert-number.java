class Solution {
    public int minBitFlips(int start, int goal) {
        int res=0;
        for(int i=0;i<=31;i++){
            if((start&(1<<i))==0 && (goal&(1<<i))!=0){
                start+=Math.pow(2,i);res++;

            }
            if((start&(1<<i))!=0 && (goal&(1<<i))==0){
                start-=Math.pow(2,i);res++;
            }
        }
        return res;
    }
}