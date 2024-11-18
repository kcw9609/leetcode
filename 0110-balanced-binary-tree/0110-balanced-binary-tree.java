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

        public boolean isBalanced(TreeNode root) {
        return checkHeight(root) != -1;
}

    public int checkHeight(TreeNode root) {
        if(root == null)return 0;

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        // 개수 차이가 1이상 나는지 판별
        if( leftHeight == -1 || rightHeight == -1 || (leftHeight - rightHeight > 1 ) || (rightHeight - leftHeight > 1 )) {
            return -1;
        }


        // 높이 보낼 필요 없지만 그냥 보냄
        return 1 + Math.max(leftHeight, rightHeight);
}
}
