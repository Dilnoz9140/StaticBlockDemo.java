package day10_shorthand_operators;
import java.util.Scanner;
public class NextLineBug {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your rent and month.");
        double rent = scan.nextDouble();
        scan.nextLine();//scan.nextline();// fix the known bug. WORK-AROUN
        String month = scan.nextLine();
        System.out.println("rent= "+ rent);
        System.out.println("month ="+month);
    }
}
