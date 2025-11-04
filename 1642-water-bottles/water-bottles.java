class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int extra = 0 , empty = 0;

        while(numBottles >= numExchange)
        {
            extra = numBottles / numExchange;
            empty = numBottles % numExchange;
            numBottles = extra + empty;
            total += extra;
        }
        
        return total;
    }
}