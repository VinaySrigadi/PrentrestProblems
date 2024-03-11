import java.util.*;
import java.util.Scanner.*;
    public class Best_Time_Buy_Sell_Stock_II_122{

        public static void main(String[] args){ 
            int[] prices = {5,2,6,1,4,7,3,6};
            System.out.println(totalProfit(prices));
        }

        public static int totalProfit(int[] prices){
            int profit = 0;

            for(int i =1;i<prices.length;i++){
                if(prices[i] > prices[i-1]){
                    profit +=  prices[i] - prices[i-1];
                }
            }return profit;
        
        
        }

    }