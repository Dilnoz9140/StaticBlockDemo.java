package Saims_tasks;
import java.util.Scanner;
public class leapYear {
   /* [If statements, operators]

    Create A program that will accept A year. Check if the year is A leap year.
    If it is A leap year print "$year is A leap year" otherwise print "$year is not A leap year"

    Hint: Lets say if A number is evenly divisible by 4 it is A leap year */
   public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the year");
       int year=scan.nextInt();
       if(year%4==0){
           System.out.println(year+" year is A leap year");
       }else {
           System.out.println(year + " year is not A leap year");

       }
   }


}
