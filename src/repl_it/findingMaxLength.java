package repl_it;
import java.util.*;
public class findingMaxLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();

        }

   String longWord=words[0];
        for(String each:words){
        if (each.length()>longWord.length()){
           longWord=each;
        }
    }

        System.out.println(longWord);


    }
}