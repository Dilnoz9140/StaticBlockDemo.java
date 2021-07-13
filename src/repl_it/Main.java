package repl_it;
import java.util.*;
public class Main {
     public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word= scan.next();

            if(word.startsWith("x")&&word.endsWith("x")){
                System.out.println(word.substring(1,word.length()-1));
            }else if(word.startsWith("x")){
                System.out.println(word.substring(1));
            }else if(word.endsWith("x")){
                System.out.println(word.substring(0,word.length()-2));

            }else{
                System.out.println(word);

            }
        }
    }





