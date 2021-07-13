package repl_it;
import java.util.*;
public class printMax {
    public static void main(String[] args) {


    Scanner input = new Scanner(System.in);
    int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int maxNum=0;
    for(int eachNum=0; eachNum<nums.length; eachNum++){
        if(nums[eachNum]>maxNum){
             maxNum=nums[eachNum];
        }
    }
        System.out.println(maxNum);
    }
}
