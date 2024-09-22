class Solution {
    public boolean reportSpam(String[] message, String[] bannedWords) {
        HashSet<String> ht=new HashSet<>();
        for(String st:bannedWords){
            ht.add(st);
        }
        int res=0;
        for(String st:message){
            if(ht.contains(st)) res++;
        }
        return res>=2;
    }
}