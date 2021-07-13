package Saims_tasks;
import java.util.Scanner;
public class identify_person {
    public static void main(String[] args) {
       /* [If statement, operators]
         Write A java program that can identify
        if A person is eligible to vote for the president. Age of voting: 18.
         Print "Eligible to vote" or "not eligible to vote".
     To make it dynamic change the three angles to be Scanner inputs*/
        Scanner input = new Scanner(System.in);
        int ageVoting=18;
        System.out.println("Enter your age:");
        int age=input.nextInt();
        if(age>=18) {
            System.out.println("Eligible to vote");
        }else{
            System.out.println("not eligible to vote");
        }

    }
}
