package day18_conditions_practice_strings_intro;
public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Tesla";
        String model = "A3";
        double leasePrice = 0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }else{
                System.out.println("invalid model");
            }
        }else if (make.equals("Audi")) {
            if (model.equals("SQ5")) {
                leasePrice = 552.0;
            } else if (model.equals("A3")) {
                leasePrice = 412.0;
            } else {
                System.out.println("Invalid model");
                return;
            }
        }else {
            System.out.println("Invalid make");
            return;
        }


        System.out.println("Make = " + make);
                System.out.println("Model = " + model);
                System.out.println("Lease Price = " + leasePrice);

    }
}