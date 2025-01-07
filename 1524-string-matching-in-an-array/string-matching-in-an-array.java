class Solution {
    public List<String> stringMatching(String[] words) {
        String all="";
        for(String st:words) all+="_"+st;
        List<String> lt=new ArrayList<>();
        for(String st:words){
            int i1=all.indexOf(st);
            int i2=all.lastIndexOf(st);
            if(i1!=-1 && i2!=-1 && i1!=i2) lt.add(st);
        }
        return lt;
    }
}