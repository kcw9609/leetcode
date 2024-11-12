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
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

            // 왼쪽과 오른쪽을 교체
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
            
        invertTree(root.left);
        invertTree(root.right);
            
        
        return root;
    }
}