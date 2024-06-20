class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        for(int i=nums2.length-1;i>=0;i--){
            int x=-1;
            while(!st.isEmpty()){
                if(st.peek()>nums2[i]){
                    x=st.peek();
                    break;
                }
                st.pop();
            }
            st.push(nums2[i]);
            hm.put(nums2[i],x);
        }
        int res[]=new int[nums1.length];
        int p=0;
        for(int i:nums1){
            res[p++]=hm.get(i);
        }
        return res;
    }
}