package day28_loops;
import  java.util.Random;
public class RandomPassword {
    public static void main(String[] args) {
        String source="ABCDEFGIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_@#$%^&*";
        Random random =new Random();
        String password="";
       for(int i = 1; i<8;i++) {
           int index = random.nextInt(71);// random 0-70
           System.out.print(source.charAt(index));
           //source.substring(index, index + 1);
           //add the char to password variable using+=
           //password=password+source.charAt(index);
           password += source.charAt(index);
       }
           System.out.print("\nYour password "+password);

    }



}

