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
        ListNode prev = null;
        ListNode current = head;
        ListNode nextNode = null;
        
        while (current != null) {
            nextNode = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move prev to current node
            current = nextNode; // Move current to next node
        }
        
        // At the end, prev will be the new head of the reversed list
        return prev;
    }
}