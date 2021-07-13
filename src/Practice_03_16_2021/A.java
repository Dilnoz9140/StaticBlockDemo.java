import java.util.*;


public class A {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter cents:");
        int quarters=0;
        int dimes=0;
        int nickels=0;
        int pennies=0;
        int cents = scan.nextInt();
        if(cents>0 && cents<100){
            quarters=cents/25;
            cents=cents%25;
            dimes=cents/10;
            cents%=10;
            nickels=cents/5;
            pennies=cents%5;
        }else{
            System.out.println("Invalid cents amount");
        }

        System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");

    }
}