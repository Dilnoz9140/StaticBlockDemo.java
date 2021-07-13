package repl_it;
import java.util.*;
public class shiftLeft {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int size = scan.nextInt();
            int[] nums = new int[size];
            for(int i = 0; i < size; i++){
                nums[i] = scan.nextInt();
            }
            //WRITE YOUR CODE HERE
            int temp=nums[0];
                for(int i=1;i<nums.length;i++){
                //          3
                nums[i-1]=nums[i];
            }
            nums[nums.length-1]=temp;
            System.out.print(Arrays.toString(nums));
        }
}