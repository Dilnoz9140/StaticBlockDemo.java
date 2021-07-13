package repl_it;
import java.util.Scanner;
public class party {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name="";
        String guestList="";
        String countinue="";
        do{
            System.out.println("Please enter guest name");
            name=input.next();
            guestList+=name;
            System.out.println("Do you want to enter new guest name:");
            countinue=input.next();
            if(countinue.equals("yes")){
                guestList+=", ";
            }
        }
        while(countinue.equals("yes"));
        System.out.println("Guest's list: "+guestList);



    }
}
