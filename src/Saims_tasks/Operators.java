package Saims_tasks;

public class Operators {
    public static void main(String[] args) {
        //Analyze the following without intellij. Calculate the output step by step

        int a = 200;
        int b = -a++ + - --a * a-- % 2 + a;
        /*  b = -200 + - 200*200%2+199
            b = -200 + -40000%2+199
            b = -200 + -0+199
            b = -200 -0+199
            b =-200+199
            b-1
         */
        System.out.println(b);
        System.out.println(a);
    }
}