package repl_it;
import java.util.Arrays;
import java.util.Scanner;
public class SHORTEST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(", ");
        String shortestWord = arr[0];
        int count = 0;
        for (String each : arr) {
            if (each.length() < shortestWord.length()) {
                shortestWord = each;
            }
        }
        for (String each1 : arr) {
            if (each1.length() == shortestWord.length()) {
                count++;
            }
        }
        String[] shortest = new String[count];
        int i = 0;

        for (String each2 : arr) {

            if (each2.length() == shortestWord.length()) {
                shortest[i] = each2;
                i++;
            }
        }

        System.out.println(Arrays.toString(shortest));

    }
}

