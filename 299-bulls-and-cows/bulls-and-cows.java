class Solution {
    public String getHint(String secret, String guess) {
        ArrayList<Character> sec=new ArrayList<>();
        ArrayList<Character> gue=new ArrayList<>();
        for(char ch:secret.toCharArray()) sec.add(ch);
        for(char ch:guess.toCharArray()) gue.add(ch);
        int bulls=0,cows=0;
        HashSet<Integer> used=new HashSet<>();
        for(int i=0;i<sec.size();i++){
            if(sec.get(i)==gue.get(i)){
                bulls++;
                used.add(i);
                sec.set(i,null);
                gue.set(i,null);
            }
        }
        for(int i=0;i<gue.size();i++){
            if(gue.get(i)!=null&&sec.contains(gue.get(i))){
                cows++;
                sec.remove((Character)gue.get(i));
            }
        }
        return bulls+"A"+cows+"B";
    }
}
