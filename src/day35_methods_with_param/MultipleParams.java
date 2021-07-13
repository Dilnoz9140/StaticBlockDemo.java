package day35_methods_with_param;

import java.util.*;

public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        showSum(scan.nextDouble(),scan.nextDouble());
    }
    public static void showSum(double num1,double num2){
        double sum=num1+num2;
        System.out.println("The sum = "+sum);

    }

}
