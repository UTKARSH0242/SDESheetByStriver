package Arrays;

public class StockBuyAndSell {
    static int maxProfit(int [] prices){
        int maxProfit = 0;
        int minSoFar = prices[0];
        for (int price : prices) {
            minSoFar = Math.min(minSoFar, price);
            int profit = price - minSoFar;
            maxProfit = Math.max(maxProfit, profit);

        }
        return maxProfit;

    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));


    }
}