package repl_it;
import java.util.Scanner;
public class wordSeperator {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String word = scan.next();
            String seperator = scan.next();
            int count = scan.nextInt();
            for(int i=0;i<count;i++){
                if(i==count-1){
                    System.out.println(word);
                    return;
                }
                System.out.print(word+seperator);
            }
        }
    }

