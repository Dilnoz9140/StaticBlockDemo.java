package day57_abstraction_polymorphism.abstract_class_vs_interface;

/**Extending:
 * Class can extend One Abstract class
 * Class can implement MULTIPLE interface
 */

public class ConcreteA extends AbstractA implements InterfaceA,InterfaceB {
    /*First non-abstract child class of Abstract class or Interface is called CONCRETE class */
    @Override
    public void absMethodA() {//Concrete sub class must override abstract methods from abstract class or interface
        System.out.println("absMethodA implementation is called");

    }
    @Override
    public void methodB(){ //Sub class can override non final methods from parent class
        System.out.println("methodB overridden version is called");
    }
   // @Override-->static methods are hidden
    public static void staticMethodC(){ // static methods are hidden -not overridden
        System.out.println("staticMethodC hidden version is called");
    }


    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - "+num);

    }
}
