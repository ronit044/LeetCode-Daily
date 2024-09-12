class Solution {
    public int trailingZeroes(int n) {
        int res=0;
        int m=5;
        while(n/m > 0){
            res+=n/m;
            m*=5;
        }
        return res;
    }
}