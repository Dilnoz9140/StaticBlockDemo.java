package day14_multi_branch_if_statements;
import java.util.Scanner;
public class Calculator1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 2 numbers:");
        System.out.println("enter 1st number:");
        double num1 = scan.nextDouble();
        System.out.println("enter 2nd number:");
        double num2 = scan.nextDouble();
        System.out.println("what operator do you want to choose:(+,-,/,**)");
        char operator = scan.next().charAt(0);
        if (operator == '-') {
            System.out.println("Your result is " + (num1 - num2));
        } else if (operator == '+') {
            System.out.println("Your result is "+ (num1 + num2));
        } else if (operator == '/') {
            System.out.println("Your result is "+(num1 / num2));
        } else if (operator == '*') {
            System.out.println("Your result is "+(num1 * num2));
        }else{
            System.out.println("Invalid operator");

        }

    }
}
