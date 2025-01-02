class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if(s.length()<=10) return new ArrayList<String>();
        List<String> res=new ArrayList<>();
        HashSet<String> hm=new HashSet<>();
        for(int i=0;i+10<=s.length();i++){
            String str=s.substring(i,i+10);
            if(hm.contains(str) && !res.contains(str)) res.add(str);
            hm.add(str);
        }
        return res;
    }
}