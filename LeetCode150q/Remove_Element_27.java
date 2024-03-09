import java.util.*;
import java.util.Scanner.*;
    public class Remove_Element_27{

        public static void main(String[] args){  

        // Scanner sc = new Scanner(System.in);
         
        // sc.close();

        int nums1[] = {0,1,2,2,3,0,4,2};
        int val = 2;
        int result = removeElement(nums1,val);
        System.out.println(result);


        }

        public static int removeElement(int[] nums1,int val){
            int count = 0;

            for(int i =0;i <nums1.length ; i++){

                if(nums1[i] != val){
                nums1[count] = nums1[i];
                count++;
                }
            } return count;

        }



    }