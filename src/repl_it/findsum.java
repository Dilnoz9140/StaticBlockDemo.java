package repl_it;
import java.util.*;
public class findsum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum=0;
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        for (int eachNum:nums){
           sum+= eachNum;
        }
        System.out.println(sum);
      }
    }





