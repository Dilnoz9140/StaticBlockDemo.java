package day_06_arithmatic_operators;

public class CarDriverInfo {
    //carModel String
    // driverName String
    /*licenseNum String
     short speed
    booleean isAutomatic
    charc licensecClass
     */
    public static void main(String[] args){
        String carModel="Tesla";
        String driverName="Dilnoza";
        String licenseNum="7777777";
        short  speed= 249;
        boolean isAutomatic=true;
        char licenseClass='D';
        System.out.println("Car model:"+ carModel);
        System.out.println("Driver name:"+ driverName);
        System.out.println(driverName + " is driving A car");
        System.out.println(driverName+" is driving "+carModel);
        System.out.println("Current speed is: "+speed);
        System.out.println("Current speed: "+speed+" mph");
        System.out.println("It is Automatic: "+isAutomatic);
        System.out.println(licenseClass+"-"+ isAutomatic);// + , wiil not work with all data types.
        // it should be at least one String data type for using +


    }

}
