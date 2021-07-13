package repl_it;
import java.util.*;
public class countEven {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
        int even=0;
        for(int eachNum:nums) {
            if (eachNum % 2 == 0) {
                even++;
            }
        }
                System.out.print(even);
    }
}