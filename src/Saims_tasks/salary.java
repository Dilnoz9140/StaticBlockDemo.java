package Saims_tasks;
import java.util.Scanner;

public class salary {
    /*[If statements, operators]

    Write A program that will accept your salary amount.
    Then also ask the user if they are full time or not (boolean).
    If theyre fulltime add 20000 to their salary,
    but if they are part time then subtract 5000. Print the final salary.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bonus = 20000;
        int subtract = 5000;
        System.out.println("Enter your salary amount:");
        double salary =scan.nextDouble();
        System.out.println("Are you full time ? (if yes, enter true otherwise enter false!)");
        boolean fullTime=scan.nextBoolean();
        if(fullTime==true){
            System.out.println("Now your salary is "+(salary+bonus));
        }else{
            System.out.println("Now your salary is "+(salary-subtract));
        }

    }
}

