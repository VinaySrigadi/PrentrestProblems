import java.util.*;
import java.util.Scanner.*;
    public class Permutation2{

        public static void main(String[] args){  

        Scanner sc = new Scanner(System.in);


         



        sc.close();
       int f =  fact(9);
       int n_r = fact(4);
        System.out.println(f/n_r);

        }

         public static int fact(int b){

             if (b==0){
             return 1;
            }
            else{

            int temp = b;
            for(int a = b-1;a >=1;a--){
                
           
           
                temp *= a;
                // System.out.println(temp);
            }
            return temp;
            }
         }

    }

   


