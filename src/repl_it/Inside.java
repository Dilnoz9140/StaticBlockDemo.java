package repl_it;
import java.util.Arrays;
import java.util.Scanner;
public class Inside {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] outer = new int[scan.nextInt()];
        int[] inner = new int[scan.nextInt()];

        for(int j = 0; j < outer.length; j++) {
            outer[j] = scan.nextInt();
        }

        for(int i = 0; i < inner.length; i++) {
            inner[i] = scan.nextInt();
        }
        Arrays.sort(inner);
        Arrays.sort(outer);
        boolean contains=false;
        for(int each:inner){
            for(int i=0;i<outer.length-1;i++){
                if(each==outer[i]) {
                    contains = true;

                    break;
                }
            }

        }


        System.out.println(contains);
    }
}
