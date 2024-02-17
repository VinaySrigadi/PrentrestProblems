import java.util.*;
import java.util.Scanner.*;

public class Harshad{

    public static void main(String[] args){
        int n = 741;
        int sum = 0 ;

        while(n != 0){
            
            int last_pick = n % 10;
            sum = sum + last_pick;
            n = n / 10;

            
        }

        if(n % sum == 0)

                System.out.println("It is Harshad");
        
        else
            System.out.println("It is not Harshad");
        
    }
}