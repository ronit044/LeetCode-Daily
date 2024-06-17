class Solution {
    public boolean judgeSquareSum(int c) {
        long low=0,high=(long)Math.ceil(Math.sqrt(c));
        while(low<=high){
            long cal=(low*low)+(high*high);
            if(cal==c) return true;
            if(cal>c){
                high--;
            }
            if(cal<c){
                low++;
            }
        }
        return false;
    }
}