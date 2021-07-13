package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus=0;
        double salesAmount =2000.55;
        if(salesAmount<=1000){
            System.out.println("Good job, you qualified for  bonus");
            bonus=50.0;
        }else{
            System.out.println("Nice! You qualified for full bonus");
            bonus=100.0;
        }
        System.out.println("Your total bonus: $"+bonus);
    }
}
