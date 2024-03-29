/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {

        }
 *     ListNode(int val) { 
            this.val = val; 
        }
 *     ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode node = head.next;
        int count = 1;
        int run = 1;

        while(node != null) {
            count++;
            node = node.next;
        }

        count = count - n;

        if(count <= 0) {
            return head.next;
        }

        ListNode currentNode = head;
        while(run != count) {
            currentNode = currentNode.next;
            run++;
        }

        ListNode unwantedNode = currentNode.next;
        currentNode.next = unwantedNode.next;

        return head;
    }
}