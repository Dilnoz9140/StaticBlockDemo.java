package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale=true;
        boolean freeShipping = true;
        String itemName = "Wooden Spoon";

       // if(onSale==true&&freeShipping==true)
        if(onSale&&freeShipping){
            System.out.println("Adding to cart-"+itemName);
        }else{
            System.out.println("Continue shopping for good deals on-"+itemName);
        }

        //add to cart only when it is freeShipping, onSale and itemName is "Wooden Spoon"
        if(onSale&&freeShipping&&itemName.equals("Wooden Spoon")) {
            System.out.println("Adding to cart-" + itemName);
        }else{
            System.out.println("Continue shopping for good deals on-"+itemName);
        }
        System.out.println("=======================================================");

        boolean isRemote=true;
        boolean hasBenefits=true;
        double salary=77_000;
        String location="Nashville";
        if(isRemote&&hasBenefits&&salary>=77_000&&location.equals("Nashville")) {
            System.out.println("Sure,I will accept this offer");
        }else{
            System.out.println("Lets consider another offer or negotiate");
        }
    }

}
