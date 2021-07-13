package day26_loop;
//import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
  //      Scanner scan = new Scanner(System.in);
        //int number=scan.nextInt();
         int number=5;
        /**
         * if number less than 1 or more than 10 print "error: invalid input"
         * exit main method:return;
         */
        if(number<1 || number>10){
            System.out.println("error: invalid input");
            return;
        }
        for(int i=1; i<=10; i++ ){
            int result=number*i;
            System.out.println(number + " x " + i +" = " +result);

        }
    }
}
