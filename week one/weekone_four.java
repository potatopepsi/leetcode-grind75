public class weekone_four {
    public int maxProfit(int[] prices) {
        int plength = prices.length;
        int max = 0;
        int maxi = 100000;
        for(int i = 0; i < plength; i++){
            if(prices[i] < maxi){
                for(int j = i+1; j < plength; j++){
                if((prices[j]-prices[i]) > max){
                    max = prices[j] - prices[i];
                }
                maxi = prices[i];
            }
            }
            
        }
        return max;

    }
}
