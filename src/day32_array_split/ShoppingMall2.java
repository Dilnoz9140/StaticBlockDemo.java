package day32_array_split;

public class ShoppingMall2 {
    public static void main(String[] args) {
        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "iPad", "iphone 12case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDs =   {12345, 12346, 12347, 12348, 12349, 12350};
        for(int i=0;i<items.length;i++){
            switch(items[i]){
                case "Shoes":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case "Jacket":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case  "Gloves":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case "Airpods":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case "ipad":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case "iphone":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;
                case "iphone 12case":
                    System.out.println(items[i]+" -$"+prices[i]+" -#"+itemIDs[i]);
                    break;

            }
        }
    }

}
