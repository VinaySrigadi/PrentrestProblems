
import java.util.*;
import java.util.Scanner.*;

public class DecimalToBinary{

    public static void main(String[] args){
    
       Scanner sc = new Scanner(System.in);
       int n = 12;
       int binary[] = new int[20];
      int i =0;
        while(n > 0){
            int r = n % 2;
            binary[i++] = r;
            n = n/2;

        }   
        for(int j = i-1;j >=0;j--)
        System.out.print(binary[j]+"");
    }
}

// 12/2 = 6  0
// 6/2 = 3  0
// 3/2 = 1  1
// 1/2 = 0 1
