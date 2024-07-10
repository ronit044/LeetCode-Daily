class Solution {
    public boolean canFinish(int l, int[][] pre) {
        ArrayList<Integer>[] adj = new ArrayList[l]; 
    for (int i = 0; i < l; i++) {
        adj[i] = new ArrayList<>();
    }
    for (int i = 0; i < pre.length; i++) {
        adj[pre[i][0]].add(pre[i][1]);
    }
    int[] inDeg = new int[l];
    Arrays.fill(inDeg,0);
    for (int i = 0; i < l; i++) {
        for(int x:adj[i]){
            inDeg[x]++;
        }
    }
    Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<l;i++)
        if(inDeg[i]==0) 
        q.add(i);
        int cnt=0;
        while(!q.isEmpty()){
            int a=q.poll();
            cnt++;
            for(int i:adj[a]){
                inDeg[i]--;
                if(inDeg[i]==0){
                    q.add(i);
                    }
                }
            }
            
        return cnt==l;
    }
}