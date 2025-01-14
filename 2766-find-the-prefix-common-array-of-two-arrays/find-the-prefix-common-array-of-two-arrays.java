class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        HashSet<Integer> ANums=new HashSet<>();
        HashSet<Integer> BNums=new HashSet<>();
        int commonCount=0;
        int res[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            ANums.add(A[i]);
            BNums.add(B[i]);
            if(ANums.contains(B[i])) commonCount++;
            if(BNums.contains(A[i]) && A[i]!=B[i]) commonCount++;
            res[i]=commonCount;
        }
        return res;
    }
}