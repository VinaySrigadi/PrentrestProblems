import java.util.*;
import java.util.Scanner.*;

public class OctalToDecimal{

    public static void main(String[] args){
    
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Octal Number");
      int a = sc.nextInt();
      
      int n = 0;
      int decimal=0;

      while(a >0){

        int temp = a % 10;
        decimal += temp * Math.pow(8,n);
        a /=10;
        n++;
      }
      System.out.println("Octal To decimal is "+decimal);
      sc.close();

    }
}