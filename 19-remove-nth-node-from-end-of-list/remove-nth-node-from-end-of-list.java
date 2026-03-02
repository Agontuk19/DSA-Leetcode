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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || head.next == null) {
            return null;
        }
        // Count length
        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        // Index from the head
        int nFromStart = count - n + 1;
        // Edge Case - Removes the head
        if (nFromStart == 1) {
            return head.next;
        }
        // Remove Node
        temp = head;
        for (int i = 1; i < nFromStart - 1; i++) {
            temp = temp.next;
        }
        if (temp.next.next == null) {
            // Edge Case (Last Element)
            temp.next = null;
        }
        else {
            temp.next = temp.next.next;
        }
        return head;
    }
}