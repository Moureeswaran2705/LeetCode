class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans=numBottles;
        //int rem=0;
        while(numBottles!=0){
            ans+=numBottles/numExchange;
           // System.out.print(ans+" ");
            int rem=numBottles%numExchange;
           // System.out.print(rem+" ");
            numBottles/=numExchange;
            numBottles+=rem;
            if(numBottles<numExchange){
                break;
            }
           // System.out.println(numBottles+" ");

        }
        //ans+=rem/numExchange;
        return ans;
    }
}