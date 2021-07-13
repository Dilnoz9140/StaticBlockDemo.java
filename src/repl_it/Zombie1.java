package repl_it;
import java.util.*;
public class Zombie1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
       int count=0;
        for (int i = 0; i >= 0; i++) {
            if(count==8) {
                System.out.println("----- EXTINCT -----");
                return;
            }else{
                System.out.print("Day " + i + " ");
                System.out.println(Arrays.toString(inhabitants));
                count = 0;
            }
            for (int i1 = 0; i1 < inhabitants.length; i1++) {
                if(inhabitants[i1]==0){
                    count++;
                }else {
                    inhabitants[i1] = inhabitants[i1] / 2;
                }

                }


            }
                }
            }

//3, 6, 0, 4, 3, 2, 7, 1



