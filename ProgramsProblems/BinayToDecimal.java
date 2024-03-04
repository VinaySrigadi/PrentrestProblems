import java.util.*;
import java.util.Scanner.*;

public class BinayToDecimal{
    public static void main(String[] args){
            
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a binary Number : ");
            int binary = sc.nextInt();
           
            int decimal = 0;
            int n = 0;            
            while(binary > 0){
                        int temp = binary % 10;
                        decimal += temp* Math.pow(2,n);
                        binary= binary / 10;    
                        n++; 
                    }
            System.out.println("DECIMAL DIGIT = "+ decimal);
            sc.close();
    }       
    }
    