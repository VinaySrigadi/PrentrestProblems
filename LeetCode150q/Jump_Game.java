import java.util.*;
import java.util.Scanner.*;
    public class Jump_Game{

        public static void main(String[] args){  

        Scanner sc = new Scanner(System.in);
         
        sc.close();

        int[] num1 = {1,1,2,5,2,1,0,0,1,3};
        System.out.println(canJump(num1));


        }

        public static boolean canJump(int[] num1){

            int finalPosition = num1.length -1;

            for(int i = num1.length -2;i >= 0;i--){
                    if(i + num1[i] >= finalPosition){
                        finalPosition = i;
                    }
            }
            return finalPosition == 0;
        }

    }