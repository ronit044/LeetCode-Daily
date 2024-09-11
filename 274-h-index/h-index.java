class Solution {
    public boolean helper(int[] c,int h){
        int count=0;
        for(int i:c){
            if(i>=h) count++;
        }
        return count>=h;
    }
    public int hIndex(int[] citations) {
        int max=0;
        for(int i:citations) max=Math.max(max,i);
        for(int i=max;i>=0;i--){
            if(helper(citations,i)) return i;
        }
        return 0;
    }
}