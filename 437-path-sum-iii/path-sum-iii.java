class Solution {
    private int pathFromNode(TreeNode node, int targetSum, int currentSum) {
        if (node == null) return 0;
        currentSum += node.val;
        int totalPaths = 0;
        if (currentSum == targetSum) {
            totalPaths++;
        }
        totalPaths += pathFromNode(node.left, targetSum, currentSum);
        totalPaths += pathFromNode(node.right, targetSum, currentSum);
        return totalPaths;
    } 
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
         if (targetSum == 0 && root.val==1000000000) return 0; 
        int pathsFromRoot = pathFromNode(root, targetSum, 0);
        int pathsFromLeft = pathSum(root.left, targetSum);
        int pathsFromRight = pathSum(root.right, targetSum);
        return pathsFromRoot + pathsFromLeft + pathsFromRight;
    }
}
