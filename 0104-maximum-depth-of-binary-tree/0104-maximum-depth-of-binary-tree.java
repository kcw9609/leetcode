/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int depth = 0;
    public int maxDepth(TreeNode root) {
        depth = find(root);
        return depth;
        
    }
    public int find(TreeNode current) {
        if(current == null) return 0;

        int left = find(current.left);
        int right = find(current.right);

        int maxValue = Math.max(left, right); // 결과: 10
        return maxValue + 1;

    }
}










