package day26_loop;

public class PrintChar {
    public static void main(String[] args) {

            String word = "python";

            for(int i = 0; i < word.length(); i++) {
                System.out.println(i +"-"+word.charAt(i));
            }

            /**
             * Long way, without loop.
             *  System.out.println(word.length());
             System.out.println(word.charAt(0));
             System.out.println(word.charAt(1));
             System.out.println(word.charAt(2));
             System.out.println(word.charAt(3));
             System.out.println(word.charAt(4)); ERROR
             */

            /**
             * print word letters in reverse
             */
            word = "dilnoza";
            for(int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
        }
    }



