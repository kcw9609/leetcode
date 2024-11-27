/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        // 범위 처리
        // 호출
        // 리스트가 비었거나, 단일 노드인 경우 그대로 반환
        if (head == null || head.next == null) {
            return head;
        }
        return link(head, head.next);
        
    }
    public ListNode link(ListNode parent, ListNode child) {
        if (child == null) {
            return parent;
        }
        ListNode newNode = link(child, child.next);
        child.next = parent;
        // 기존 방향 끊기(재귀호출이라 ㄱㅊ음)
        parent.next = null;
        return newNode;

    }
}