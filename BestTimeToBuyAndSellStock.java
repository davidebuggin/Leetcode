public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = { 1, 7, 6, 4, 3, 1 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];

            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }
        return maxProfit;
    }

}

// public static int maxProfit(int[] prices){
// int maxProfit = 0;
// for(int i = 0; i < prices.length; i++){
// int buyday = prices[i];
// for(int j = prices.length -1; j > i; j--){
// int sellday = prices[j];
// if(sellday > buyday){
// if(sellday - buyday > maxProfit){
// maxProfit = sellday - buyday;
// }
// }
// }
// }

// return maxProfit;

// }
