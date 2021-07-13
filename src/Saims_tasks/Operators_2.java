package Saims_tasks;

public class Operators_2 {
    public static void main(String[] args) {
        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
    /*Analyze the following without intellij. Calculate the output step by step

    int x = 300;
    int y = 400;
    int z = x + y - x * y + x / y;
        z = 300+400-300*400+300/400
        z = 700-120000+0.75
        z =700-119999.25
        z=-119299.25
        z=-119300
     */

   // What is the value of x, y, and z?
}
