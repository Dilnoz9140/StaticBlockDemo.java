package day27_loops;

public class indexOf {
    public static void main(String[] args) {
        String word = "githib";
        char letter = 'i';
        int index = -1;

        for (int i = 0; i < word.length(); i++) {
            // System.out.println(i+" - " + word.charAt(i));
            if (word.charAt(i) == letter) {
                index = i;
                //System.out.println(letter + " is found at index " + index);
                break;// exit for loop
            }

            }
        if(index ==-1){
            System.out.println(letter + " is not founded");
        }else{
            System.out.println(letter + " is found at index " + index);
        }
    }
}
