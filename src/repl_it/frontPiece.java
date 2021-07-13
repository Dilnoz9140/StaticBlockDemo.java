package repl_it;
import java.util.*;
public class frontPiece {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] num=new int[size];
        for(int i=0;i<size;i++){
           num[i]=scan.nextInt();
        }
        int[] sizeMore2=new int[2];
        if(num.length>=2){
            for(int i=0;i<2;i++){
                sizeMore2[i]=num[i];
            }
            System.out.println(Arrays.toString(sizeMore2));
        }else{
            if(num.length<2){
                System.out.println(Arrays.toString(num));
            }
        }


    }
}