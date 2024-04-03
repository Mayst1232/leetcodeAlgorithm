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

    public ListNode swapPairs(ListNode head) {

        if(head == null || head.next == null) 
            return head;

        ListNode s1 = head.next;
        ListNode s2 = s1.next;

        s1.next = head;
        head.next = swapPairs(s2);

        return s1;
    }
}