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
        if(head==null||head.next==null){
            return head;
        }
        ListNode odd=head;
        ListNode even=odd.next;
        while(odd!=null &&even!=null){
            int temp=odd.val;
            odd.val=even.val;
            even.val=temp;
            if(even!=null){
                odd=even.next;
            }
            if(odd!=null){
                even=odd.next;
            }
        }
        return head;
    }
}