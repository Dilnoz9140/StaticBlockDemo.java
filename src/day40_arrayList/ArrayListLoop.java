package day40_arrayList;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();//Polymorphic way of declaring
        System.out.println(nums);
        System.out.println("size = "+nums.size());


         nums.add(34);  nums.add(44);   nums.add(77);  nums.add(27);    nums.add(47);
        nums.add(49);    nums.add(39);    nums.add(16);    nums.add(77);        nums.add(25);


        System.out.println("nums = "+nums);

        nums.remove(0);// remove first index
        System.out.println("nums = "+nums);

        nums.remove(new Integer(16)); //removes number 16 not 16th index
        System.out.println("nums = "+nums);

        nums.remove(new Integer (77)); //removes first 77 number
        System.out.println("nums = "+nums);


        //for loop - iterate through all values and print
        for(int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        //for each loop, and print all in same line
        for(int each : nums) {
            System.out.print(each +" ");
        }
    }

}


