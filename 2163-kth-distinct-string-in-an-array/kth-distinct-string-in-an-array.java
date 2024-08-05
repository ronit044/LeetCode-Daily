class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new HashMap<>();
        for(String str:arr){
            hm.put(str,hm.getOrDefault(str,0)+1);
        }
        List<String> lt=new ArrayList<>();

        int i=0;
        for(String st:arr){
            if(hm.get(st)==1){
                lt.add(st);
            }
        }
        if(lt.size()<k) return "";
        return lt.get(k-1);
    }
}