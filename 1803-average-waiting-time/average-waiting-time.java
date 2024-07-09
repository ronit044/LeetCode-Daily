class Solution {
    public double averageWaitingTime(int[][] cust) {
        int l=cust.length;
        int ind=0,prevTime=0;
        double s=0;
        // ArrayList<Integer> wt=new ArrayList<>();
        for(int i=0;i<l;i++){
            if(cust[i][0]>prevTime){
                // wt.add(cust[i][1]);
                s+=cust[i][1];
                prevTime=cust[i][0]+cust[i][1];
                continue;
            }
            int totalTime=cust[i][1]+prevTime;
            // wt.add(totalTime-cust[i][0]);
            s+=totalTime-cust[i][0];
            prevTime=totalTime;
        }
        return s/l;
    }
}