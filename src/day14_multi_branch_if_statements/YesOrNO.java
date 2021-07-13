package day14_multi_branch_if_statements;
import java.util.Scanner;
public class YesOrNO {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Are you sure you want to delete this file?");
        System.out.println("If yes select : \"Y\" ");
        char select=scan.next().charAt(0);
        if(select=='Y') {
            System.out.println("Your file has been deleted");
        }else{
            System.out.println("Your file has not been deleted");
        }



    }
}
