import java.util.*;
import java.util.Scanner.*;

public class Autophormic{

    public static void main(String[] args){
        int n = 25 ;
        int sq = n * n ;
        if(n%10 == sq%10)
                System.out.println("Num is Autophormic");
        else
                System.out.println("Not Autophormic");        
    }
       

    }
    


//25*25 =625
//25%10 = (5)
//625%10 = (5)
//25/10 = 2
//625/100 = 62 