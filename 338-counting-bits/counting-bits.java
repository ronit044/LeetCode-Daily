class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        int c=0,num=0;
        for(int i=0;i<=n;i++){
            c=0;
            num=i;
            while(num!=0){
                if((num&1)!=0) c++;
                num>>=1;
            }
            res[i]=c;
        }
        return res;
    }
}