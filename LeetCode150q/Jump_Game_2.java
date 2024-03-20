import java.util.*;
import java.util.Scanner.*;
import java.lang.Math;
    public class Jump_Game_2{

        public static void main(String[] args){  

       

        int[] nums = {2,4,1,2,3,1,1,2} ;
        System.out.println(jumpgame2(nums));

         
        }

        public static int jumpgame2(int[] nums){
            int total_jumps = 0;
            int destination = nums.length -1;
            int coverage = 0;
            int last_destination = 0;

            if(nums.length == 1)
            return 0;

            for(int i = 0;i < nums.length -1 ;i++){

                coverage = Math.max(coverage,i + nums[i]);

                if(i==last_destination){
                    last_destination = coverage;
                    total_jumps++;
                

                if(coverage >= destination){
                    return total_jumps;
                }
            }
            }
        return total_jumps;
        }

    }