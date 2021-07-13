package repl_it;
import  java.util.Scanner;
public class tripleletters {
    /**We'll say that A "triple" in A string is A char appearing three times in A row.
    Print out the number of triples in the given string. The triples may overlap. */


     public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String str = scan.next();
            int count = 0 ;
            for(int i=0; i<str.length()-2;i++){
                if(str.charAt(i)==str.charAt(i+1)&&str.charAt(i)==str.charAt(i+2)){
                    count++;
                }

            }
            System.out.println(count);
        }
}
