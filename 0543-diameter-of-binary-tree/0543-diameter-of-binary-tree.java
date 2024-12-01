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
    public int depth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // 깊이 탐색
        // 
      
        find(root);
        return depth;
        
    }
    public int find(TreeNode node) {

        // 예외처리
        if(node == null) return 0;

        int left = find(node.left);
        int right = find(node.right);
        if(left + right > depth) depth = left + right;
        

        return Math.max(left, right) + 1 ;
        

    
    }
}














