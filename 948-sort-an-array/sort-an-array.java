class Solution {
    public int[] merge(int[] arr1,int[] arr2){
        int l1=arr1.length,l2=arr2.length;
        int c1=0,c2=0,k=0;
        int[] res=new int[l1+l2];
        while(c1<l1 && c2<l2){
            if(arr1[c1]<=arr2[c2])
            res[k++]=arr1[c1++];
            else
            res[k++]=arr2[c2++];
        }
        while(c1<l1){
            res[k++]=arr1[c1++];
        }
        while(c2<l2){
            res[k++]=arr2[c2++];
        }
        return res;
    }
    public int[] mergeSort(int[] nums,int left,int right){
        if(left==right) return new int[]{nums[left]};
        int mid=(left+right)/2;
        return merge(mergeSort(nums,left,mid),mergeSort(nums,mid+1,right));
    }
    public int[] sortArray(int[] nums) {
       return mergeSort(nums,0,nums.length-1);   
    }
}