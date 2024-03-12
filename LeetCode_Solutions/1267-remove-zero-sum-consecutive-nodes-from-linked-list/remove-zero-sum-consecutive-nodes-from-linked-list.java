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
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        Map<Integer, ListNode> hm = new HashMap<>();
        int pSum = 0;
        hm.put(pSum, dummy);
        while (head != null) {
            pSum += head.val;
            if (hm.containsKey(pSum)) {
                ListNode rem = hm.get(pSum).next;
                int SSum = pSum;
                while (rem != head) {
                    SSum += rem.val;
                    hm.remove(SSum);
                    rem = rem.next;
                }
                hm.get(pSum).next = head.next;
            } else {
                hm.put(pSum, head);
            }
            head = head.next;
        }
        return dummy.next;
    }
}