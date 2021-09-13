package InterviewQuestions.java.arrays;

public class StockBuySell {

    public static void main(String[] args) {

        int[] arr = {14, 12, 70, 15, 99, 65, 21, 90};
        //int result = stockBuySellToMaxProfit(arr);
        int maxProfit = calculateMaxProfit(arr);
        System.out.println("Max profit is " + maxProfit);

    }

    public static int stockBuySellToMaxProfit(int[] arr) {

        int buyDay = arr[0];
        int sellDay = arr[0];
        int maxProfit;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= buyDay) {
                buyDay = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= sellDay) {
                sellDay = arr[i];
            }
        }

        maxProfit = sellDay - buyDay;

        return maxProfit;
    }

    public static int calculateMaxProfit(int[] arr) {

        int lowerPrice = arr[0];
        int maxProfit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int profit = 0;
            if (arr[i] > lowerPrice) {

                profit = arr[i] - lowerPrice;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            } else {
                lowerPrice = arr[i];
            }
        }
        return maxProfit;
    }


}

