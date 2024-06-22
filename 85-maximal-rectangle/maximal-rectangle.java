class Solution {
    public void sml(int[] arr,int[] res,Stack<Integer> st){
        int l=arr.length;
        for(int i=0;i<l;i++){
            int ind=-1;
            while(!st.isEmpty()){
                if(arr[st.peek()]<arr[i]){
                    ind=st.peek();
                    break;
                }
                st.pop();
            }
            res[i]=ind;
            st.push(i);
        }
    }
    public void smr(int[] arr,int[] res,Stack<Integer> st){
        int l=arr.length;
        for(int i=l-1;i>=0;i--){
            int ind=l;
            while(!st.isEmpty()){
                if(arr[st.peek()]<arr[i]){
                    ind=st.peek();
                    break;
                }
                st.pop();
            }
            res[i]=ind;
            st.push(i);
        }
    }
    public int findSize(int[] arr){
        Stack<Integer> st=new Stack<>();
        int l=arr.length;
        int smlArr[]=new int[l];
        int smrArr[]=new int[l];
        sml(arr,smlArr,st);
        st.clear();
        smr(arr,smrArr,st);
        int res=0;
        for(int i=0;i<l;i++){
            int x=(smrArr[i]-smlArr[i]-1)*arr[i];
            res=Math.max(res,x);
        }
        return res;
    }
    public int maximalRectangle(char[][] matrix) {
        int l=matrix[0].length;
        int arr[]=new int[l];
        int k=0,res=0;
        for(char[] x:matrix){
            k=0;
            for(char y:x){
                if(y=='0') arr[k++]=0;
                else arr[k++]+=1;
            }
            res=Math.max(res,findSize(arr));
        }
        return res;
    }
}