class Solution {
    ArrayList<Integer> lt=new ArrayList<>();
    public boolean check(int n){
        if(n==1) return true;
        int sum=0;
        while(n!=0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        if(lt.contains(sum)) return false;
        lt.add(sum);
        return check(sum);
    }
    public boolean isHappy(int n) {
        return check(n);
    }
}