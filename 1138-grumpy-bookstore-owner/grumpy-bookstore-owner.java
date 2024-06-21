class Solution {
    public int maxSatisfied(int[] c, int[] grumpy, int minutes) {
        int l=grumpy.length;
        int finalAns=0;
        for(int i=0;i<l;i++){
            if(grumpy[i]==0){
                finalAns+=c[i];
            }
        }
        int y=0,res=0;
        for(int i=0;i<l;i++){
            if(grumpy[i]==1){
                y+=c[i];
            }
             if (i >= minutes && grumpy[i - minutes] == 1) {
                y -= c[i - minutes];
            }
         res = Math.max(res, y);

        }
        return finalAns+res;
    }
}