package day05_primitives_concatnation;

public class WatchInfo {
    public static void main(String[] args){

    String brand = "Chopard";
    String color = "Gold";
    double price = 4600.0;
    boolean waterResistant = true;
    boolean isSmart = false;
    char gender = 'F';
             System.out.println("Brand:\t\t\t "+brand);
        System.out.println("Color:\t\t\t "+color);
        System.out.println("Price:\t\t\t $"+price);
        System.out.println("Water Resistant: "+waterResistant);
        System.out.println("Smart Watch: \t "+isSmart);
        System.out.println("Gender: \t\t "+gender);
        System.out.println("----------------------------");

        System.out.println("Watch brand\t\t\t"+brand+"\n"+"Color\t\t\t\t"+color+"\n"+
                "Price\t\t\t\t"+price+"\n"+"Water resistant\t\t"+waterResistant+"\n"+"Is smart\t\t\t"+isSmart+"\n"+
                "Gender\t\t\t\t"+gender);

      }
}
