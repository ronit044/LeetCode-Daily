class Solution {
    public boolean helper(int []arr,int m,int force){
        int lastPlaced=0,l=arr.length,count=1;
        for(int i=1;i<l;i++){
            if(Math.abs(arr[i]-arr[lastPlaced])>=force){ 
                count++;
                lastPlaced=i;
            }
        }
        if(count>=m) return true;
        return false;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low=1,high=Integer.MIN_VALUE;
        for(int i:position){
            high=Math.max(high,i);
        }
        int res=0;
        while(low<=high){
            int force=(low+high)/2;
            if(helper(position,m,force)){
                res=force;
                low=force+1;
            }
            else{
                high=force-1;
            }
        }
        return res;
    }
}