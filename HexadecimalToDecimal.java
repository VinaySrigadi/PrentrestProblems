import java.util.*;
import java.util.Scanner.*;

public class HexadecimalToDecimal{

    public static void main(String[] args){
    
       String hex = "D6C1";
       System.out.println (hex.charAt(0));
       System.out.println (convert (hex));

    }

    static int convert(String hex){
        String digits = "0123456789ABCDEF";
        int val = 0;
        for (int i = 0;i < hex.length(); i++){
            char c = hex.charAt(i);
            int d = digits.indexOf(c);
            val = 16 * val + d;
        }
        return val;
    }
}