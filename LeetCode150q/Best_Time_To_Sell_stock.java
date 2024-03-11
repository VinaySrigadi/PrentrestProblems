import java.util.*;
import java.util.Scanner.*;
    public class Best_Time_To_Sell_stock{

        public static void main(String[] args){  
            int[] prices = { 7,1,5,3,6,4 };

            // maxProfit(prices);  
             System.out.println(maxProfit(prices));         

        

        }

        public static int maxProfit(int[] prices){
          
            int maxPrice = 0;
            int minPrice =  70000;
            
            for(int i = 0;i < prices.length;i++){
                if(prices[i] < minPrice){
                    minPrice = prices[i];
                }
                else if(prices[i] - minPrice > maxPrice){
                    maxPrice = prices[i] - minPrice;
                }
            }
            return maxPrice;
            
            
                
                   
        }
        

    }