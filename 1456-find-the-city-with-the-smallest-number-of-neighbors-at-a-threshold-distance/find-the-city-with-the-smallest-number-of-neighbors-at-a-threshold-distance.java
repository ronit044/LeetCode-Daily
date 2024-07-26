import java.util.Arrays;

class Solution {
    public int findTheCity(int n, int[][] edges, int threshold) {
       int[][] dist = new int[n][n];
       for (int i = 0; i < n; i++) Arrays.fill(dist[i], Integer.MAX_VALUE);
       for (int[] arr : edges) {
           dist[arr[0]][arr[1]] = arr[2];
           dist[arr[1]][arr[0]] = arr[2];
       }
       for (int i = 0; i < n; i++) dist[i][i] = 0;
       for (int k = 0; k < n; k++) {
           for (int i = 0; i < n; i++) {
               for (int j = 0; j < n; j++) {
                   if (dist[i][k] == Integer.MAX_VALUE || dist[k][j] == Integer.MAX_VALUE) continue;
                   dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
               }
           }
       }
      int resultCity = -1, minCount = n;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (dist[i][j] <= threshold) count++;
            }
            if (count <= minCount) {
                resultCity = i;
                minCount = count;
            }
        }
        return resultCity;
    }
}
