class Solution {
    public void sml(int[] heights,int[] res){
        Stack<Integer> st=new Stack<>();
        int ind=-1;
        for(int i=0;i<heights.length;i++){
            ind=-1;
            while(!st.isEmpty()){
                if(heights[st.peek()]<heights[i]){
                    ind=st.peek();
                    break;
                }
                st.pop();
            }
            res[i]=ind;
            st.add(i);          
        }
    }
    public void smr(int[] heights,int[] res){
        Stack<Integer> st=new Stack<>();
        int ind=-1;
        for(int i=heights.length-1;i>=0;i--){
            ind=heights.length;
            while(!st.isEmpty()){
                if(heights[st.peek()]<heights[i]){
                    ind=st.peek();
                    break;
                }
                st.pop();
            }
            res[i]=ind;
            st.add(i);          
        }
    }

    public int largestRectangleArea(int[] heights) {
        int l=heights.length;
        int smlArr[]=new int[l];
        int smrArr[]=new int[l];
        sml(heights,smlArr);
        smr(heights,smrArr);
        int res=0;
        for(int i=0;i<l;i++){
            int x=(smrArr[i]-smlArr[i]-1)*heights[i];
            res=Math.max(res,x);
        }
        return res;
    }
}