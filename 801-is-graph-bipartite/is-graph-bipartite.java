class Solution {
    public boolean isBipartite(int[][] graph) {
        final int n = graph.length;
        int[] group = new int[n];

        // Try to perform DFS from every node in case the graph has several components
        for (int i = 0; i < n; i++) {
            if (group[i] == 0) {
                if (!dfs(i, -1, group, graph)) {
                    return false;
                }
            }
        }

        return true;
    }

    private boolean dfs(int curr, int prevG, int[] group, int[][] graph) {
        if (group[curr] != 0) {
            return group[curr] != prevG;
        }

        group[curr] = -prevG;

        for (int next : graph[curr]) {
            if (!dfs(next, -prevG, group, graph)) {
                return false;
            }
        }

        return true;
    }
}