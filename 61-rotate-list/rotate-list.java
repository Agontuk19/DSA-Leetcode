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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k <= 0) {
            return head;
        }
        //Normalize K
        ListNode temp = head;
        int length = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        k = k % length;
        if (k == 0) {
            return head;
        }

        //Break the List
        ListNode curr = head;
        for (int i = 1; i < length - k; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;

        //Connect two list
        curr = newHead;
        for (int i = 1; i < k; i++) {
            curr = curr.next;
        }
        curr.next = head;
        head = newHead;
        return head;
    }
}