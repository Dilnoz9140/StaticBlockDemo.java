package repl_it;
import java.util.*;
public class findNonDuplicate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(),
                input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(nums[i]);
                /*
    int count;
    for(int i=0; i<nums.length; i++){
      count=0;
      for(int j=0; j<nums.length; j++) {
        if(nums[i] == nums[j]){
          count++;
        }
      }
      if (count == 1){
        System.out.println(nums[i]);*/


            }

        }
    }

}


