package day_08_casting_scanner;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scan = new Scanner(System.in);
        int age = scan.nextInt(); /*-> value will be assigned from console/keyboard when program is running
        imagine bottom 11 here int age=11;*/
        System.out.println(age+"-that's great age!");


    }
}


