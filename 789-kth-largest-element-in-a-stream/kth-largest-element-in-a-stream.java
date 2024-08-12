class KthLargest {
    ArrayList<Integer> lt=new ArrayList<>();
    int k;
    public KthLargest(int k, int[] nums) {
        for(int i:nums){
            this.lt.add(i);
        }
        this.k=k;
    }
    public int add(int val) {
        this.lt.add(val);
        Collections.sort(lt);
        return lt.get(lt.size()-k);
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */