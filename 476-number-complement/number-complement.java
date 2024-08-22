class Solution {
    public int findComplement(int num) {
        String bin=Integer.toBinaryString(num);
        int res=0,pow=0;
        for(int i=bin.length()-1;i>=0;i--){
            if(bin.charAt(i)=='0'){
                res+=Math.pow(2,pow);
            }
            pow++;
        }
        return res;
    }
}