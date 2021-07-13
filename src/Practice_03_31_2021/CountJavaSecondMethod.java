package Practice_03_31_2021;

public class CountJavaSecondMethod {
    public static void main(String[] args) {
        String str ="java is fun. java class today, javascript";
        int count =0;

        for(int i=0; i<str.length()-3;i++) {
            String eachFourLetters = str.substring(i, i + 4);
            if (eachFourLetters.equals("java")) {
                count++;
            }
        }
            System.out.println("Java was found "+count+" times");

    }
}
