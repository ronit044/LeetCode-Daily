class Solution {
    public int largestRectangleArea(int[] heights) {
        int l=heights.length;
        int sml[][]=new int[l][2];
        int smr[][]=new int[l][2];
        int p=0;
        Stack<int[]> st=new Stack();
        for(int i=0;i<l;i++){
            int x=-1;
            int ind=-1;
            while(!st.isEmpty()){
                if(st.peek()[0]<heights[i]){
                    x=st.peek()[0];
                    ind=st.peek()[1];
                    break;
                }
                st.pop();
            }
            sml[p++]=new int[]{x,ind};
            st.push(new int[]{heights[i],i});
        }
        st.clear();
        p=l-1;
        for(int i=l-1;i>=0;i--){
            int x=l;
            int ind=l;
            while(!st.isEmpty()){
                if(st.peek()[0]<heights[i]){
                    x=st.peek()[0];
                    ind=st.peek()[1];
                    break;
                }
                st.pop();
            }
            smr[p--]=new int[]{x,ind};
            st.push(new int[]{heights[i],i});
        }
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<l;i++){
            int h=(smr[i][1]-sml[i][1]-1)*heights[i];
            ans=Math.max(ans,h);
        }
        return ans;
    }
}