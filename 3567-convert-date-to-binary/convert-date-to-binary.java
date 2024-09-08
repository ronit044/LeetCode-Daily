class Solution {
    public String convertDateToBinary(String date) {
        String arr[]=date.split("-");
        String str="";
        for(String st:arr){
        str+=Integer.toBinaryString(Integer.parseInt(st))+"-";
        }
        return str.substring(0,str.length()-1);
    }
}