package day08_casting_scanner;
import java.util.Scanner;

public class NewPracticeScanner {
    public static void main(String[] args) {
        System.out.println("What is your first and last name?");
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        System.out.println(fullName+"-How can i help you?");


    }
}
