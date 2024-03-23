import java.util.*;
import java.util.Scanner.*;
    public class H_Index_274{

        public static void main(String[] args){  

        Scanner sc = new Scanner(System.in);
         
        sc.close();
        int[] citations = {3,1,2,3,2};
        System.out.println(hIndex(citations));  //Output:

         
        }

        public static int hIndex (int[] citations){
            int[] bucket = new int[citations.length+1];

            for(int i = 0;i<citations.length;i++){
                if(citations[i] > citations.length){
                    bucket[citations.length]++; 
                }
                else{
                    bucket[citations[i]]++;
                }
            }

            int count = 0;
            for(int i = bucket.length-1;i>=0;i--){
                count += bucket[i];
                if(count >= i)
                return i;

            }
            return 0;
        
        
        }

    }