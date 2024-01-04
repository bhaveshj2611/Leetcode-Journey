class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int buy = 0;
        int sell = 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]<prices[i+1]){
                buy = buy + prices[i];
                sell = sell + prices[i+1];
            }
        }
        return sell-buy;
    }
}