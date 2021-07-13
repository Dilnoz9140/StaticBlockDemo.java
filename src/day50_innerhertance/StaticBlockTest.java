package day50_innerhertance;

public class StaticBlockTest {
    public static void main(String[] args) {
        StaticBlockDemo st1 = new StaticBlockDemo();//static (10)>constructor
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st2 = new StaticBlockDemo();//constructor(20)
        System.out.println(StaticBlockDemo.num);
        StaticBlockDemo st3 = new StaticBlockDemo();//constructor(25)
        System.out.println(StaticBlockDemo.num); //25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75
    }
}