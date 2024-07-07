class Solution {
    public int numWaterBottles(int numBott, int numEx) {
        int sum=0,rem=0;
        sum+=numBott;
        while(numBott>=numEx){
            sum+=numBott/numEx;
            rem=numBott%numEx;
            numBott=(numBott/numEx)+rem;
        }
        return sum;
    }
}