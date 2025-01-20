class Solution {
    public int helper(int n){
        if(n==1 || n==0) return 1;
        if(n==2) return 2;
        int count=0;
        for(int i=1;i<=n;i++){
            count+=helper(i-1)*helper(n-i);
        } 
        return count;
    }
    public int numTrees(int n) {
        return helper(n);
    }
}