package day24_loops;
import java.util.Scanner;
public class GiveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me 5 dollar:");
        int dollars =scan.nextInt();
        while(dollars !=5){
            System.out.println("No Give me exactly 5 dollars");
            dollars =scan.nextInt();

        }
        System.out.println("Thank you for 5 dollars");
    }
}
