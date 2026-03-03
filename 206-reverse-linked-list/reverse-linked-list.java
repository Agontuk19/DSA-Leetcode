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
        if (head == null) {
        return null;
    }
    ListNode prevNode = null;
    ListNode curr = head;
    ListNode nextNode;
    while (curr != null) {
        nextNode = curr.next;
        curr.next = prevNode;
        prevNode = curr;
        curr = nextNode;
    }
    head = prevNode;
    return head;
    }
}