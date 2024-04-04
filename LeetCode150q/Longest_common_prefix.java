import java.util.*;
import java.util.Scanner.*;
    public class Longest_common_prefix{

        public static void main(String[] args){  

        String[] str1 = {"flower","flow","flight"};
       

        System.out.println(longestCommonPrefix(str1));

         
        }

        public static String  longestCommonPrefix(String[] strs){

            StringBuilder result = new StringBuilder();
            Arrays.sort(strs);

            char[] first = strs[0].toCharArray();
            char[] last = strs[strs.length-1].toCharArray();

            for(int i = 0;i<strs.length;i++){
                if(first[i] != last[i])
                break;
                result.append(first[i]); 
            }
            return result.toString();
    }
}