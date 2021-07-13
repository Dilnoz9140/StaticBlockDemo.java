package day09;
import java.util.Scanner;

public class GroceryShoppingV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" *****Target *****");
        System.out.println("Enter price for milk:");
        double price1 = scan.nextDouble();
        System.out.println("Enter price for bread");
        double price2 = scan.nextDouble();
        System.out.println("Enter price for cucumber");
        double price3 = scan.nextDouble();
        double totalPrice = price1 + price2 + price3;
        System.out.println("Total price is:"+totalPrice);
        double priceWithTax = totalPrice*0.93;
        System.out.println("Price with tax is:"+priceWithTax);

    }
}