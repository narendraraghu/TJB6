package excel;

public class maxProfitBySellStock {
    public static void main(String[] args) {
        int stocks[] = {7,1,5,3,6,4};
        System.out.println(getMaxProfit(stocks));
    }
    private static int getMaxProfit(int[] stocks) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < stocks.length; i++) {
            minPrice=   Math.min(stocks[i],minPrice);
            profit = Math.max(profit,stocks[i]-minPrice);
        }
        return profit;
    }
}
