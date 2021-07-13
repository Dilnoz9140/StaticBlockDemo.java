package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args){
        sum(7,77);
        MethodOverLoading.sum(4.7, 7.7);
        sum(4, 7, 47);
        sum((int)4.7, 1, 2);
        sum(7, 1.4);//automatically cast to double
        sum("Hello","Word");
    }


    public static void sum(int num1, int num2){
        System.out.println("sum(int num1, num2)");
        System.out.println("result = " +(num1+num2));
    }
    public static void sum(int num1, int num2,int num3){
        System.out.println("sum(int num1, num2, num3)");
        System.out.println("result = " +(num1+num2+num3));
    }
    public static void sum(double num1, double num2){
        System.out.println("sum(double,double)");
        System.out.println("result = " +(num1+num2));
    }
    public static void sum(String str1, String str2){
        System.out.println("sum(string,string)");
        System.out.println("result = " +(str1+str2));
    }
}
