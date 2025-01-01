class Solution {
    public int findTheWinner(int n, int k) {
        int curr=0;
        ArrayList<Integer> lt=new ArrayList<>();
        for(int i=1;i<=n;i++) lt.add(i);
        while(lt.size()>1){
            curr=(curr+k-1)%lt.size();
            lt.remove(lt.get(curr));
        }
        return lt.get(0);
    }
}