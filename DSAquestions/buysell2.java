package DSAquestions;

public class buysell2 {
        public static  int maxProfit(int[] prices, int fee) {
            int maxProfit = Integer.MIN_VALUE;
            int n = prices.length;

            int i=0,j=1;
            int curr = 0;
            while(j < n){
                if(prices[i] < prices[j]){
                    curr += prices[j] - prices[i];
                    System.out.println(prices[j] + " - " + prices[i] + " " + curr);
                    curr -= fee;
                    i = j+1;
                    j = i+1;
                }
            }

            return curr;
        }

    public static void main(String[] args) {
        int[] arr = {1,3,7,5,10,3};
        System.out.println(maxProfit(arr,3));
    }
}
