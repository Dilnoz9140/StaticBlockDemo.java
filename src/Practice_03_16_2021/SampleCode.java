package Practice_03_16_2021;


import java.util.Scanner;

public class SampleCode {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter A number");
        int number = input.nextInt();

        if(number < 0) {
            System.out.println("Enter A positive number");
            number = input.nextInt();
            if(number > 50) {
                number += 2000;
            }
        } else if(number <= 100) {
            System.out.println("Bigger number, subtracted 50");
            number -= 50;

        } else {
            number *= 10;
        }

        System.out.println(number);

    }
}
