import java.util.Arrays;

public class Buy_Two_Chocolates {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int am = money - (prices[0] + prices[1]);
        return am < 0 ? money : am;
    }
}
