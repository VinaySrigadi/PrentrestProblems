import java.util.*;
import java.util.Scanner.*;

public class HexaDecimalToDecimal2{

    public static void main(String[] args){
    
       Scanner sc = new Scanner(System.in);
       //String a = sc.nextString();
        String hex = "D6C1";
       
      
            String digits = "0123456789ABCDEF";
            int val = 0;
            for(int i=0;i < hex.length();i++){
                char c = hex.charAt(i);
                int d = digits.indexOf(c);
                                System.out.println(val+" "+d);
                val =16 * val + d;
                System.out.println(val);

                
            }
        }





       

}
