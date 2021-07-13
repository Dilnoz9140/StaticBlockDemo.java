package Saims_tasks;
import java.util.Scanner;
    public class CreditScore {
        public static void main(String[] args) {
            Scanner scan=new Scanner(System.in);
            checkEligible(scan.nextInt());
        }
        public static void checkEligible(int creditScore){
            if(creditScore>=700){
                System.out.println("You are eligible for leasing this car");
            }else{
                System.out.println("Sorry you are not eligible for leasing this car");
            }
        }
    }


