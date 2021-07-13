package day39_wrapper_classes;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        // auto-boxing
        int num1=500;
        Integer num2=num1;
        Integer num3=234;

        //Un-boxing: object > primitive
        Double d1 = new Double(100.5);
        double d2 = d1;
        double d3 = new Double(345.3);
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(1);
        nums.add(2,5);
        System.out.println(nums);
    }
}
