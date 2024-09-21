class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> arr=new ArrayList<>();
        for(int i=1;i<=n;i++){
            arr.add(i);
        }
      Collections.sort(arr, (a, b) -> {
    String st1 = Integer.toString(a);
    String st2 = Integer.toString(b);
    int minLength = Math.min(st1.length(), st2.length());

    for (int i = 0; i < minLength; i++) {
        char c1 = st1.charAt(i);
        char c2 = st2.charAt(i);
        if (c1 != c2) {
            return c1 - c2;
        }
    }
    return st1.length() - st2.length();
    });
        return arr;
    }
}