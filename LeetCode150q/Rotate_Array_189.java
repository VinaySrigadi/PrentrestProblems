import java.util.*;
import java.util.Arrays;
import java.util.Scanner.*;
    public class Rotate_Array_189{

        public static void main(String[] args){  

        Scanner sc = new Scanner(System.in);
         
        sc.close();
        int nums[] = {1,2,3};
        int k = 4;
        // rotate(nums,k);
        // for(int j = 0;j < nums.length;j++){
        //         System.out.print(nums[j] + " ");
        //   }
          System.out.println(Arrays.toString(rotate(nums,k)));



        }
          public static int[] rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;
            reverse(nums,0,n-1);
            reverse(nums,0,k-1);
            reverse(nums,k,n-1);
            return nums;
                   
    }

    public static void reverse(int[] nums,int start,int end){
        while(start <= end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    }