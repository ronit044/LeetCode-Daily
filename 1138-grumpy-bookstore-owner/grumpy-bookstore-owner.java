class Solution {
    public int helper(int[] c,int[] g,int start,int end){
        int res=0;
        for(int i=start;i<end;i++){
            if(g[i]==1){
                res+=c[i];
            }
        }
        return res;
    }
    public int maxSatisfied(int[] c, int[] grumpy, int minutes) {
        int l=grumpy.length;
        int finalAns=0;
        for(int i=0;i<l;i++){
            if(grumpy[i]==0){
                finalAns+=c[i];
            }
        }
        int y=0;
        for(int i=0;i<=l-minutes;i++){
            int x=helper(c,grumpy,i,i+minutes);
            y=Math.max(x,y);
        }
        return finalAns+y;
    }
}