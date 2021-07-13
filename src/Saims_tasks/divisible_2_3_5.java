
package Saims_tasks;
import java.util.Scanner;

public class divisible_2_3_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number:");
       int number = scan.nextInt();


        if (number % 2 == 0) {
            System.out.println(number + " is divisible by 2: true");
        } else {
            System.out.println(number + " is divisible by 2: false");
        }
        if (number % 3 == 0) {
            System.out.println(number + " is divisible by 3: true");
        } else {
            System.out.println(number + " is divisible by 3: false");
        }
        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5: true");
        } else {
            System.out.println(number + " is divisible by 5: false");
        }
    }
}
    /*
Create A program that will accept A number and it will print if it is evenly divisible by 2, 3, and 5

Ex:
number = 65

Output:
65 is divisible by 2: false
65 is divisible by 3: false
65 is divisible by 5: true
*/


