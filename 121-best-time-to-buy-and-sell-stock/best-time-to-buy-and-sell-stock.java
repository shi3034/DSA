class Solution {
    public int maxProfit(int[] prices) {
    int n=prices.length,min=Integer.MAX_VALUE,profit=0,max_pro=0;
    for(int i=0;i<n;i++){
        if(prices[i]<min)
        min=prices[i];
        profit=prices[i]-min;
        if(profit>max_pro)
        max_pro=profit;
    }
    return max_pro;
}
}