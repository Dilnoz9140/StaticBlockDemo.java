package repl_it;

import java.util.Arrays;

public class MultipleWords {
    public static void main(String[] args) {
        String words="knife, wooden spoons, plates, cups, forks, pan, pot, trashcan";
        String []words1=words.split(", ");
        System.out.println(Arrays.toString(words1));
        for(String each: words1){
            if(each.contains(" ")){
                System.out.println(each);
            }
        }

    }
}
