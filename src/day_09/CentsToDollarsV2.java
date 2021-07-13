package day_09;
import java.util.Scanner;

public class CentsToDollarsV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int dollar= cents/100;
        int remainingCents=cents%100;
        System.out.println("cents "+cents);
        System.out.println(dollar+" dollar");

        System.out.println("You have:"+dollar+" dollar "+remainingCents+" cents");
    }
}