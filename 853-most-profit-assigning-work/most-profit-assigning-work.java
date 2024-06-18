class Solution {
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int wl=worker.length,pl=profit.length,dl=difficulty.length;
        int res=0;
        for(int i=0;i<pl;i++){
            for(int j=0;j<pl-i-1;j++){
                if(profit[j+1]<profit[j]){
                    swap(difficulty,j+1,j);
                    swap(profit,j+1,j);
                }
            }
        }
        for(int i=0;i<wl;i++){
            for(int j=dl-1;j>=0;j--){
                if(difficulty[j]<=worker[i]){
                    res+=profit[j];
                    break;
                }
            }
        }
        return res;
    }
}