import java.util.*;
import java.util.Scanner.*;

public class Abundant{

    public static void main(String[] args){
      int a =12;
      int i ;
      int ok = 0;
      for(i=1;i<a;i++)
      {
          
    
          if(a%i == 0) {
            
             ok =  ok +i ;
             System.out.println(i);   
          }
          

      }
      if(ok > a){
                    System.out.println("It is Abundant");
                     System.out.println("Abundance is :" + (ok - a));
                }
                else
                {
                    System.out.println("It is not Abundant");
                }

    }
}
    