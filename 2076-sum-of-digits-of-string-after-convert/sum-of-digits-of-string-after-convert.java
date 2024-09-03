class Solution {
    public String sumOfDigitsInString(String st) {
        int sum = 0;
        for (char ch : st.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum += Character.getNumericValue(ch);
            }
        }
        return Integer.toString(sum);
    }
    public int getLucky(String s, int k) {
        String final_string="";
        for(char ch:s.toCharArray()){
            final_string+=(int)ch-96;
        }
        for(int i=1;i<=k;i++){
            final_string=sumOfDigitsInString(final_string);
        }
        return Integer.parseInt(final_string);
    }
}