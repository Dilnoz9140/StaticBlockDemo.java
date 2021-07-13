package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = "+balance);
        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        balance=balance-baklava;
        System.out.println("balance after baklava = " +balance);
        double kunafe = 44.45;
        System.out.println("kunafe = "+ kunafe);
        balance=balance-kunafe;
        System.out.println("balance after kunafe = " +balance);
        kunafe=kunafe/2;
        System.out.println(kunafe);
        balance=balance-kunafe;
        System.out.println("balance after 2nd kunafe = "+balance);
        double plov=7.99;
        System.out.println("plov = "+plov);
        balance=balance-plov;
        System.out.println("balance after plov  = "+balance);
        double icedTea = 3.0;
        System.out.println("iced tea = "+icedTea);
        //buy 4 iced teas and decrease balance
        balance = balance-(icedTea*4);
        System.out.println("balance after icedTea = "+balance);
        System.out.println("returning baklava = "+baklava);
        balance=balance+baklava;
        System.out.println("balance after returning bakalava = "+balance);



    }
}
