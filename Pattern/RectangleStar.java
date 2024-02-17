import java.util.*;
import java.util.Scanner.*;

public class RectangleStar{

    public static void main(String[] args){
    
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Row");
       int row = sc.nextInt();
       System.out.println("Enter Number column");
       int  col = sc.nextInt();

       for(int i =1;i<=row;i++){

        for(int j = 1;j<=col;j++){
            
                System.out.print("*");

            

            
        }
        System.out.println();
       }







       sc.close();

    }
}
/*

(1,1);(1,2);(1,3);(1,4)
(2,1)             (2,4)
(3,1);(3,2);(3,3);(3,4)


*/