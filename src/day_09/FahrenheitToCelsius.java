package day_09;
import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n ****Fahrenheit Converter To Celsius****\n");
        System.out.println("  Enter Fahrenheit:");
        double fahrenheitValue = scan.nextDouble();
        double celsiusValue= (fahrenheitValue-32)/1.8;
        System.out.println(fahrenheitValue+" Farenheit in Celcius: "+celsiusValue);
    }
}
