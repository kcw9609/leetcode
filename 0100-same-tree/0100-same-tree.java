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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 왼쪽확인, 오른쪽확인
        // 구조가 다르면 return false
        // 값이 다르면 return false
        return find(p, q);
        
    }
    public boolean find(TreeNode p, TreeNode q) {
        // 예외처리
        if((p == null && q != null) || (q == null && p != null) ) {
            return false;
        }
        else if (p == null && q == null) {return true;}
        
        if(p.val != q.val) {
            return false;
        }

        boolean left = find(p.left, q.left);
        boolean right = find(p.right, q.right);

        if(left && right) return true;
        else {return false;}

    }
}