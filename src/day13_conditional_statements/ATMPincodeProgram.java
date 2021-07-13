package day13_conditional_statements;
import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode,inputPincode;
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        System.out.println("Enter your pincode:");
        secretPincode=7777;
        inputPincode = scan.nextInt();
        if(secretPincode==inputPincode){
            System.out.println( "Welcome to your account.");
            System.out.println( "You can withdraw, check balance, deposit");
        }else{
            System.out.println( "Incorrect pincode!"+inputPincode);
            System.out.println("Please try again.");
        }
    }
}
