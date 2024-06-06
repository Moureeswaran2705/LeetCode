class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        Map<Integer,Integer>mp=new HashMap<>();
        for(int card:hand){
            mp.put(card,mp.getOrDefault(card,0)+1);
        }
        Arrays.sort(hand);
        for(int card:hand){
            if(mp.containsKey(card)){
                for(int i=card;i<card+groupSize;i++){
                    if(!mp.containsKey(i)){
                        return false;
                    }
                    mp.put(i,mp.get(i)-1);
                    if(mp.get(i)==0){
                        mp.remove(i);
                    }
                }
            }
        }
            return true;
    }
}