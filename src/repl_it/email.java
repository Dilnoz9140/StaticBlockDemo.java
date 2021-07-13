package repl_it;
import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        if(email.contains("_")){
            int atPosition = email.indexOf("@");
            int underscorePs=email.indexOf("_");
            String firstName = email.substring(0,underscorePs);
            String lastName = email.substring(underscorePs+1,atPosition);
            System.out.println(lastName+"_"+firstName+"@gmail.com");
        }else{
            System.out.println(email);
        }


    }
}





