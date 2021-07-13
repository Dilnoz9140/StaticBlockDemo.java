package day15_logicalops_switch_ternary;
import java.util.Scanner;
public class CarDealershipWithScan {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your budget:");
        double  budget = scan.nextDouble();
        System.out.println("Enter model looking for:");
        String model =scan.next();
        double carPrice=5000.0;
        double carPrice1=10000.0;

        if(carPrice <= budget && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")) {
            System.out.println("Ready to purchase model = " + model + ", price = " + carPrice);
        }else if(carPrice1<=budget&&budget>=carPrice&&model.equals("BMW") || model.equals("Honda")) {
            System.out.println("Ready to purchase model  = " + model + " price = " + carPrice1);
        }else{
            System.out.println("Does not have "+model+" for this price");

        }

    }
}
