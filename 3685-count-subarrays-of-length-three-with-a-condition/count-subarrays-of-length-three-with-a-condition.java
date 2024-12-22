class Solution {
    public int countSubarrays(int[] res) {
        int l = res.length, re = 0;
        for (int i = 0; i + 2 < l; i++) {
            if ((res[i] + res[i+2]) * 2 == res[i+1]) {
                re++;
            }
        }
        return re;
    }
}
