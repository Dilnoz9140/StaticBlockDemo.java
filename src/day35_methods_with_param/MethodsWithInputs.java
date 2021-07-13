package day35_methods_with_param;
import java.util.Scanner;
public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(94);
        int count=95;
        displayValue(count);
        greetByName("Adam");
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter A name:");
        greetByName(scan.next());

    }
    public static void displayValue(int num){
        System.out.println("value is "+num);
    }
    /**
     * method name:greetByName
     * @param/input; String name
     * It prints "Hello {name},how are you today?"
     */
    public static void greetByName(String name){
        System.out.println("Hello "+name+", how are you today?");
    }
}
