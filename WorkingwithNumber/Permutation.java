import java.util.*;
import java.util.Scanner.*;

public  class Permutation{

    public static void main(String[] args){
       perm obj1 = new perm();
       
    
      

    }
class fatc{       
       int n,r;
       n=10;
       r=3;
            int fact = 1;
       while(n>1){
       int num = n;
       n = n- 1;
       
       
    //    System.out.println(n);
        fact *= n;
        


       }System.out.println(fact);
       // return fact;


}

class  perm extends fatc {

        int deno = fact.n-fact.r;
        int denofact = 1;

        while  (deno >= 1) {
             obj1.denofact *=deno;

            perm.deno -=1;
           
           System.out.println(denofact);
       //     return denofact;
}

     

    }
}
                         

