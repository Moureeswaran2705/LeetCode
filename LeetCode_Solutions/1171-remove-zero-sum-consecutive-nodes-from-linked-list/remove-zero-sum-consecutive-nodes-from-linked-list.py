# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeZeroSumSublists(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = ListNode()
        dummy.next = head
        hm = {}
        pSum = 0
        hm[pSum] = dummy
        while head:
            pSum += head.val
            if pSum in hm:
                rem = hm[pSum].next
                SSum = pSum
                while rem != head:
                    SSum += rem.val
                    del hm[SSum]
                    rem = rem.next
                hm[pSum].next = head.next
            else:
                hm[pSum] = head
            head = head.next
        return dummy.next
