package day09_scanner_practice;
import java.util.Scanner;
public class NumberGuesser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hi! I am the Number Guesser\nToday, I will figure out the number that you are thinking of!\n" +
                "Please state your name below");
        scan.next();
        String name = scan.next();
        System.out.println("Hi, " + name + "! Please think of A number from 1 to 10");
        System.out.println("Please type any letter on your keyboard and click enter once you are done");
        scan.next();
        String letter = scan.next();
        System.out.println("Alright, now multiply the number by 2");
        System.out.println("Please type any letter on your keyboard and click enter once you are done");
        scan.next();
        String letter1 = scan.next();
        System.out.println("Next, add ten to your product");
        System.out.println("Please type any letter on your keyboard and click enter once you are done");
        scan.next();
        String letter2 = scan.next();
        System.out.println("Now, divide your current number by two");
        System.out.println("Please type any letter on your keyboard and click enter once you are done");
        scan.next();
        String letter3 = scan.next();
        System.out.println("Lastly, subtract five from your current number, this should be the number that you were thinking of in the beginning");
        System.out.println("Thank you for participating!");
    }
}
