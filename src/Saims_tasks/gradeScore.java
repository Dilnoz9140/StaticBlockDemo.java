package Saims_tasks;
import java.util.Scanner;

public class gradeScore {
    public static void main(String[] args) {
        /*Write A program that will give the grade after the retake.
        The program should read A score of the test and which attempt it was.

    If its the first attempt -> subtract 10%
    If its the second attempt -> subtract 20%
    If its the third attempt -> subtract 35%
    */
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter the attempt number And the grade that you got after retake");
        System.out.println("Attempt number");
        int attemptNum = scan.nextInt();
        System.out.println("Score");
        double grade = scan.nextDouble();
        if (attemptNum==1) {
            System.out.println("Your grade is: " + grade * 0.9);
        }
            if(attemptNum==2) {
                System.out.println("Your grade is: " + grade * 0.8);
            }
                if (attemptNum == 3) {
                    System.out.println("Your grade is: "+grade*0.65);
                }

            }
        }
