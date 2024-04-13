import java.util.Arrays;
class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]+prices[i+1]<=money){
                money = money-(prices[i]+prices[i+1]);
                break;
            }
        }
        return money;
    }
}