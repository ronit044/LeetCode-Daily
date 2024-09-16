class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> mins=new ArrayList<>();
        for(String st:timePoints){
            String ar[]=st.split(":");
            int hr=Integer.parseInt(ar[0])*60;
            int mints=Integer.parseInt(ar[1]);
            mins.add(hr+mints);
        }
        // System.out.println(mins);
        Collections.sort(mins);
        int res=Integer.MAX_VALUE;
        for(int i=0;i<mins.size();i++)
        {
            for(int j=i+1;j<mins.size();j++){
                int diff=Math.abs(mins.get(i)-mins.get(j));
                res=Math.min(res,Math.min(diff,1440-diff));
            }
        }
        return res;

    }
}