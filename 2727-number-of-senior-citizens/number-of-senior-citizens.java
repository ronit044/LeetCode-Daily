class Solution {
    public int countSeniors(String[] details) {
        int res=0;
        for(String ch:details){
            int age=Integer.parseInt(ch.substring(11,13));
            if(age>60) res++;
        }
        return res;
    }
}