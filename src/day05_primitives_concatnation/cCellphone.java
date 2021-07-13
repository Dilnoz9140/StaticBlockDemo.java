package day05_primitives_concatnation;

public class cCellphone {
    public static void main(String[] args){
        String brand;
        brand="Apple";
        String model;
        model="Iphone12";
        String color;
        color="white";
        double price;
        price=999.99;
        int storage;
        storage=128;
        boolean hasCamera;
        hasCamera=true;
        System.out.println(brand+"\t" + color+"\t"+  model+ "\t"+  price +"\t"+ storage+"\t"+ hasCamera);


        //WITH MESSAGE
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is $" + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);

        System.out.println("brand name:" +brand + "\nmodel name:" + model + "\ncolor: " + color +
                "\nprice: " + price + "\nstorage: " + storage + "GB"+ "\nhasCamera:" + hasCamera);




    }
}
