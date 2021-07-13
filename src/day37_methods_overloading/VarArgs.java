package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10,14);
        addNumbers(11,14,17,24);
        addNumbers(100,200,300,400,500,600,700,800,1000);
        addNumbers();

        // int...myNumber = 10,4; Error, var args can only be used as A method parameter
    }

                       //      varargs 0 and more
    public static void addNumbers(int... nums){
     //inside the method, it is used as regular array
     int sum =0;
     for (int n:nums){
         sum+=n;
     }
        System.out.println("sum = "+sum);
    }
}
