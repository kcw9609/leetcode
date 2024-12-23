
class Solution {

    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // 범위 설정
        if(root == null) return false;
        // 같으면 재귀적으로 isIdentical호출
        if(isIdentical(root, subRoot)) return true;
        // 다르면 다음 노드로 이동
        else { // 양쪽 모두 호출해야함 -> return 의 || 문으로 호출
            return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        }

        
    }

   
    public boolean isIdentical(TreeNode head, TreeNode sub){
        // 범위 설정
         if(head == null && sub == null) return true;
         if(head == null || sub == null) return false;
        // if(head == null || sub == null) return head==sub;
        if(head.val != sub.val) return false;

        return isIdentical(head.left, sub.left) && isIdentical(head.right, sub.right);
        

    }
}


















