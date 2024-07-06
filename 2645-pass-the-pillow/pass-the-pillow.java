class Solution {
    public int passThePillow(int n, int time) {
       int c=time/(n-1);
       return c%2!=0?n-(time%(n-1)):1+(time%(n-1));
    }
}