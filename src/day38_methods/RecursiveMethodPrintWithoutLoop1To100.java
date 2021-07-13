package day38_methods;
//recursive method to do that where method will call itself
public class RecursiveMethodPrintWithoutLoop1To100 {
    public static void main(String[] args) {
        printNums(1);
    }

    public static void printNums(int num) {
        System.out.print(num + " ");
        num++;
       if (num <= 100) {
            printNums(num);
        }
    }
}