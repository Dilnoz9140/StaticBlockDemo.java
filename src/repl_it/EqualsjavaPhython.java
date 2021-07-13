package repl_it;
import java.util.Scanner;
public class EqualsjavaPhython {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            String sentence = scan.nextLine();
            int javaCount =0;
            int pythonCount=0;
            for(int i=0; i<sentence.length()-3;i++){
                if(sentence.substring(i,i+4).equals("java")){
                    javaCount++;
                }
            }
            for(int n=0; n<sentence.length()-5;n++){
                if(sentence.substring(n,n+6).equals("python")){
                    pythonCount++;
                }
            }
            if( javaCount==pythonCount) {
                System.out.println("true");
            } else{
                System.out.println("false");
            }
        }
    }


