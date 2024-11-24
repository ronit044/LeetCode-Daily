class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        long res = 0; 
        int minAbs = Integer.MAX_VALUE;
        int negCount = 0; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res += Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) {
                    negCount++;
                }
                minAbs = Math.min(minAbs, Math.abs(matrix[i][j]));
            }
        }
        if (negCount % 2 != 0) {
            res -= 2 * minAbs;
        }

        return res;
    }
}
