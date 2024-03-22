import java.util.*;
import java.util.Scanner.*;
 import java.util.HashMap; 
    public class TwoSum{

        public static void main(String[] args){ 

            int[] nums = {16,4,23,8,15,42,1,2};
            
            int target = 19;
          
            System.out.println(Arrays.toString(twoSumHashing(nums,target)));

        

         
        }
    

        public static int[] twoSumHashing(int[] nums,int target){

            Map<Integer, Integer> map = new HashMap<>();

            for(int i =0;i<nums.length;i++){
                int complement = target - nums[i];

                if(map.containsKey(complement)){
                    return new int[]{map.get(complement),i};

                }
                
             
                    map.put(nums[i],i);
                
                }              
                throw new IllegalArgumentException("No Sum Solution");
            }

        
        
        }


    
    