class Solution {
    public int minFlips(int a, int b, int c) {
        int res=0;
        for(int i=0;i<32;i++){
            int a1 = (a >> i) & 1;  
            int b1 = (b >> i) & 1; 
            int c1 = (c >> i) & 1; 
            if((a1|b1)!=c1){
                 if (c1 == 1) {
                    res++;  
                } else {
                    res += a1 + b1;  
                }
            }
        }
        return res;
    }
}