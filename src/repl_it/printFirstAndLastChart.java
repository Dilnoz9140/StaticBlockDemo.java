package repl_it;
import java.util.*;
public class printFirstAndLastChart {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
            // Write your code below

            for(int i=0;i<words.length;i++){
               words[i]=""+words[i].charAt(0)+words[i].charAt(words[i].length()-1)+"";
            }
            System.out.print(Arrays.toString(words));
        }
    }

