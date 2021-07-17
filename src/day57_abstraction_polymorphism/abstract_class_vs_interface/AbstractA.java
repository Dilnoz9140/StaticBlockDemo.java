package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {
    int num1;
    private double price;
    public static  int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA(){// abstract class can have constructor
        System.out.println("AbstractA constructor");
    }


    public abstract void absMethodA();
    /** private abstract void absMethodA();
     *  public static abstract void absMethodJ();
     *  public final abstract void absMethodQ
     */ //Abstract methods cannot be private, static or final.

    public void methodB(){
        System.out.println("methodB called");
    }
     public static void staticMethodC(){

        System.out.println("static methodC is called");
     }

}
