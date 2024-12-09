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
    public boolean isPalindrome(ListNode head) {
        // set
        ListNode low = head;
        ListNode fast = head;
        Stack<Integer> stack = new Stack<>();
        
        // two points로 중간 지점 찾음
        while(fast != null && fast.next != null) {
            
                // put stack low
                stack.push(low.val);
                low = low.next;
                fast = fast.next.next;
        }
        // nodes가 짝수인 경우, 가운데 노드 건너뜀
        if(fast != null) {
            low = low.next;
        }
        while (low != null) {
            // stack peek비교 -> 같으면 pop
            if(stack.peek() != low.val) return false;
            stack.pop();
            low = low.next;

        }
        return true;

       
        // t1은 index 1 start and jupm 1
        // t2 = start index 1 and jump 2
        // t1이 중간이 됐을때부터 스택에서 pop
        
    }
}