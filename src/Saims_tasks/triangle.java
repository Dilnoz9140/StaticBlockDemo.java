package Saims_tasks;
import java.util.Scanner;
public class triangle {
   /* [Triangle - If statement, operators]

    A triangle is valid if the sum of all the three angles is equal to 180 degrees.
    Write A program that declares three integers as angles and check whether the triangle is valid or not.
    Print "Valid triangle" or "Not A valid triangle".

            => To make it dynamic change the three angles to be Scanner inputs*/
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       System.out.println("Enter 3 angles to see if it's A valid triangle");
       System.out.println("Enter 1st angels:");
       int a = scan.nextInt();
       System.out.println("Enter 2nd angels:");
       int b = scan.nextInt();
       System.out.println("Enter 3rd angels:");
       int c = scan.nextInt();
       int sum=a+b+c;
       if(sum==180){
           System.out.println("Valid triangle");
       }else{
           System.out.println("Not A valid triangle");
       }




   }

}
