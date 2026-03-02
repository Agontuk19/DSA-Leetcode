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
        // Finding MidNode + 1
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode midNode = slow;

        // Reverse the second half
        ListNode prev = null;
        ListNode curr = midNode;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Compare left and right half
        ListNode leftPointer = head;
        ListNode rightPointer = prev;
        while (rightPointer != null) {
            if (leftPointer.val != rightPointer.val) {
                return false;
            }
            leftPointer = leftPointer.next;
            rightPointer = rightPointer.next; 
        }
        return true;
    }
}