package Arrays;

import java.util.Arrays;
import java.util.Map;

public class BuyTwoChocolates {
    public static void main(String[] args) {
        int[] price = {98, 54, 6, 34, 66, 63, 52, 39};
        System.out.println(buyChoco(price, 62));
    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        if ((prices[0] + prices[1]) <= money)
            return  (money - (prices[0] + prices[1]));
        return  money;
    }
}
