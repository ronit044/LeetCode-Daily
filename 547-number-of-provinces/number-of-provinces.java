class Solution {

    public void bfs(List<Integer>[] adj, boolean[] vis, int start) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        vis[start] = true;

        while (!q.isEmpty()) {
            int node = q.poll();
            for (int neighbor : adj[node]) {
                if (!vis[neighbor]) {
                    vis[neighbor] = true;
                    q.add(neighbor);
                }
            }
        }
    }

    public int findCircleNum(int[][] isConnected) {
        int l = isConnected.length;
        List<Integer>[] lt = new ArrayList[l + 1];
        for (int i = 0; i < l + 1; i++) lt[i] = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (isConnected[i][j] == 1) {
                    lt[i + 1].add(j + 1);
                    lt[j + 1].add(i + 1);
                }
            }
        }
        
        boolean[] visited = new boolean[l + 1];
        int provinces = 0;

        for (int i = 1; i <= l; i++) {
            if (!visited[i]) {
                provinces++;
                bfs(lt, visited, i);
            }
        }

        return provinces;
    }
}