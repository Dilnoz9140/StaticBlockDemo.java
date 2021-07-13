package day22_string_manipulation;
import java.util.Scanner;
public class StringSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        int underScore = email.indexOf("_");
        int atPosition = email.indexOf("@");
        int dotPosition = email.indexOf(".");
        String firstName = email.substring(0, underScore);
        firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        String lastName = email.substring(underScore + 1, atPosition);
        lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        String domain = email.substring(atPosition + 1, dotPosition);
        System.out.println("First Name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("Domain: " + domain);
    }
}






