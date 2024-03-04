import java.util.*;
import java.util.Scanner.*;

public class Hcf
{

    public static void main(String[] args)
    {
          int n1 = 36,n2 =60,hcf = 0; 

          
            for(int i = 1;i<=n1/2 || i <= n2;i++)
        {
            
                if(n1%i == 0 && n2%i ==0 )
                {
                    System.out.println(i);
                    hcf =i ;
                    
                }

        }
        System.out.println("It Is Highest Common Integer"+hcf);
    }
}
    