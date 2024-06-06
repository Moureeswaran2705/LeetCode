class Solution:
  def isNStraightHand(self, hand: List[int], groupSize: int) -> bool:
    count = collections.Counter(hand)
    #print(sorted(count))
    hand.sort()
    for card in hand:
        if card in count:
            for i in range(card,card+groupSize):
                if not i in count:
                    return False
                count[i]-=1
                if count[i]==0:
                    del count[i]
    return True