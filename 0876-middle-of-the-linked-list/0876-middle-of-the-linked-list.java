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
    /** 
    public ListNode middleNode(ListNode head) {
        // 선언
        int count = 0; ListNode current = head;
        // 크기 파악
        while(current.next != null) {
            
            current = current.next;
            count ++;
        }
        ListNode cur = head;

        // 중간으로 이동
        for(int i = 0 ; i < (count+1) / 2 ; i ++) {
            cur = cur.next;

        }
        return cur;
        
    }
    */
    public ListNode middleNode(ListNode head) {
        // 2 points
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow = slow.next;
        return slow;


    }
}













