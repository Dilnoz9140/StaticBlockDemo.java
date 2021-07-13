package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class AndOperatorsPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Where are you located ? (1st letter capital please!)");
        String location=scan.nextLine();
        System.out.println("How much are you offering?");
        double salary=scan.nextDouble();
        System.out.println("Is it remote? (type true or false)");
        boolean isRemote=scan.nextBoolean();
        System.out.println("Does it have benefits?  (type true or false)");
        boolean hasBenefits=scan.nextBoolean();

        if(isRemote==true&&hasBenefits==true&&salary>=77_000&&location.equals("New York")) {
            System.out.println("Sure,I will accept this offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }

    }
}
