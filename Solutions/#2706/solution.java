import java.util.Arrays;
class solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int n = prices.length;
        for(int i=0;i<n-1;i++){
            if(prices[i]+prices[i+1]<=money){
                money = money-(prices[i]+prices[i+1]);
                break;
            }
        }
        return money;
    }
}