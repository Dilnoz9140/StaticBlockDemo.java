package day25_loop;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");
        int start = scan.nextInt();
        int end = scan.nextInt();
        if(start>end){
            System.out.println("reverse numbering is not supported");
        }
        for (start = start; start <= end; start++) {
            System.out.println(""+start);
        }

        }

    }
