package repl_it;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int[] nums1=new int[nums.length];
        int i1=0;
        for(int i=nums.length-1;i>=0;i--){
            nums1[i1]=nums[i];
            i1++;

        }
        nums=nums1;
        System.out.println(Arrays.toString(nums));
    }
}
