package day32_array_split;

public class etsy {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        String[]zonesToDeploy = zones. split(",");
        for(String eachZones:zonesToDeploy){
            System.out.println(eachZones);
        }
    }
}
