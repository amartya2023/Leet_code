import java.util.*;

public class buy_and_sell_stock {

    public int maxProfit(int[] prices) {
        int buy_price = prices[0];
        int profit = 0;

        for(int i=1;i<prices.length;i++){
            if(prices[i] < buy_price) {
                buy_price = prices[i];
            } else {
                int curr_profit = prices[i] - buy_price;
                profit = Math.max(curr_profit, profit);
            }
        }
        return profit;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] prices = new int[size];
        System.out.println("Enter the elements of the array: ");

        for(int i=0; i<size; i++){
            prices[i] = sc.nextInt();
        }

        buy_and_sell_stock obj = new buy_and_sell_stock();
        int maxProfit = obj.maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);

        sc.close();
    }
}
