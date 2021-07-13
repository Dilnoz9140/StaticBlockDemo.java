package day25_loop;

public class ForLoopFirst {
    public static void main(String[] args) {
        /**
         * below is infinite llop with for loop like;while(true
         * for(;;){
         * System.out.println("Hello,world");
         * }
         */
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hello,world");
        }
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}