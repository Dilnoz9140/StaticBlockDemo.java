package day09;

public class CentsToDollars {
    public static void main(String[] args) {
        int cents=777;
         int dollar=cents/100;
         int remainingCents=cents%100;
        System.out.println("cents="+cents);
        System.out.println("dollar="+dollar);
        System.out.println("remainingCents="+remainingCents);
        System.out.println("in "+cents+" cents:"+dollar+" dollar "+remainingCents+" cents");

    }
}
