package Saims_tasks;
import java.util.Scanner;

public class oxygen {
    public static void main(String[] args) {
        /*
You are diving in the ocean. Your oxygen tank has A certain level (number) and
you must print A message based on the level x
> Above 90 - Your tank is full
> Above 80 - Still okay
> Above 70 - Don't go too far
> Above 60 - Start to head back
> Above 50 - Be careful now you at at 50%  */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your oxygen level:");
        int oxygen = scan.nextInt();
        if(oxygen>=90&&oxygen<=100) {
            System.out.println("Your tank is full");
        }if(oxygen>=80&&oxygen<90){
                System.out.println( "Still okay");
            }if(oxygen>=70&&oxygen<80){
            System.out.println("Don't go too far");
        }if(oxygen>=60&&oxygen<70){
            System.out.println("Start to head back");
        }if(oxygen>=50&&oxygen<60){
            System.out.println("Be careful now you at at 50% ");

        }


    }
}
