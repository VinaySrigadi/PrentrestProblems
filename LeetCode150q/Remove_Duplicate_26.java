import java.util.*;
import java.util.Scanner.*;
    public class Remove_Duplicate_26{

        public static void main(String[] args){  

            int nums1[] = {0,0,1,1,1,2,2,3,3,4,4};
            int result = removeDuplicate(nums1);
            System.out.println("= "+result);
            for(int k=0;k < nums1.length;k++){
                System.out.println(nums1[k]); 
            }

        

        }

        public static int removeDuplicate(int[] nums1 ){
                int count = 0;


                for(int i=0;i<nums1.length;i++){
                    if(i < nums1.length -1 && nums1[i] == nums1[i+1]){
                        continue;
                    }else{
                         
                        nums1[count] = nums1[i];
                        count++;
                        
                    }
                   
                    
                       
                    
        }return count;
        }

        //wrong 
// public static int removeDuplicate (int[] num1){
//     int count = 0;

//     for(int i = 0;i <num1.length-1;i++){
//         if(num1[i] != num1[i+1]){
//             count++;
//         }
//     }return count;


// }
    
    }