package day25_loop;

public class PrintStars {
    public static void main(String[] args) {
        for (int stars = 1; stars <= 2; stars++) {
            System.out.print("\u2B50   ");
        }
        System.out.println();//start new line
        String myStars ="";
        //for lopp :fill 5 Starts to myStars variable.
        for (int stars = 1;stars<=5;stars++){
            myStars+="* ";
        }

        System.out.println("my stars = "+myStars);
    }
}
