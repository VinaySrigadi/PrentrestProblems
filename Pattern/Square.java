import java.util.*;
import java.util.Scanner.*;

public class Square{

    public static void main(String[] args){
    
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number ");

        int sq = sc.nextInt();
        int tem = 0;

        while(tem < sq){
            System.out.println("");
        for(int i = 0;i < sq;i++){
            
            System.out.print(" * ");
        }
        tem ++;
       }

       sc.close();

    }
}