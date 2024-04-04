import java.util.*;
import java.util.Scanner.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
    public class RandomizedSet_380{

        public static void main(String[] args){  
            

             RandomSet obj = new RandomSet();
         boolean param_1 = new obj.insert(val); 
         boolean param_2 = new obj.remove(val);
         int param_3 = new obj.getRandom();

          param_1(1); // Inserts 1 to the set. Returns true as 1 was inserted successfully.
            param_2(2); // Returns false as 2 does not exist in the set.
            param_1(2); // Inserts 2 to the set, returns true. Set now contains [1,2].
            param_3(); // getRandom() should return either 1 or 2 randomly.
            param_2(1); // Removes 1 from the set, returns true. Set now contains [2].
            param_1(2); // 2 was already in the set, so return false.
            param_3();  // Since 2 is the only number in the set, getRandom() will always return 2.
      

       


        }
        class RandomSet{

        ArrayList<Integer> nums;
        HashMap<Integer, Integer> locs;
        Random randObj = new Random();

        public void randomizedSet(){
            nums = new ArrayList<Integer>();
            locs = new HashMap<Integer,Integer>();       
        
        }
        
        public boolean insert(int val){
            if(locs.contains.Key(val)) return false;
            locs.put(val,nums.size());                // In Hash
            nums.add(val);                           // In ArrayList
            return true;
        
        }

        public boolean remove(int val){
            if(! locs.contains.Key(val)) return false;

            int loc = locs.get(val);

            if(loc < nums.size() -1){
                int lastone = nums.get(nums.size() -1);
                nums.set(loc,lastone);
                locs.put(lastone,locs);
            }
            locs.remove(val);
            nums.remove(nums.size() - 1);
            return true;       
        
        }

        public int getRandom(){
            return nums.get(randObj.nextInt(nums.size()));
        
        
        }

    }
    }