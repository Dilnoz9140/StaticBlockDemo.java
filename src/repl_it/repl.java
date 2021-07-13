package repl_it;
import java.util.Scanner;
public class repl {
   public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] arr = new String[8];
            for (int i=0;i<8;i++)
            {
                arr[i] = input.nextLine();
            }

            for(int i=0;i<arr.length-1;i+=2){
                if(i>3){
                    System.out.println(arr[i]+", "+arr[i+1]);
                }else{
                    System.out.println(arr[i]+" , "+arr[i+1]);

                }
            }
        }

    }


