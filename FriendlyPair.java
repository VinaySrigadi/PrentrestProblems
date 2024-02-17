
import java.util.*;
import java.util.Scanner.*;

public class FriendlyPair{

    public static void main(String[] args){
        int n1 = 7, n2 = 30,sum = 0,sum2 = 0;

        for(int i = 1;i<=n1/2;i++)
        {
                if(n1%i == 0){
                    sum =i + sum;
                    System.out.println(sum);
                }

        }
        for(int j = 1;j<=n2/2;j++)
        {
                if(n2%j == 0){
                    sum2 =j + sum2;
                     System.out.println(sum2);
                }

        }
        if(sum==n1 && sum2==n2){
        System.out.println("It is Friendly pair");
        }
        else{
            System.out.println("It is not Friendly pair");
        }
    }
}


  