package day21_string_manipulation;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub", "lub"));
        System.out.println("word = " + word);

        word = word.replace("hub", "lab");
        System.out.println(("word = " + word));

        //github
        //i->o  A->i--->gotlib
        System.out.println(word.replace('i', 'o').replace('A', 'i'));

        String sentence = "java is fun";
        String withNoSpaces = sentence.replace(" ", "");
        System.out.println("withNoSpaces =" + withNoSpaces);

        //"java" replace to "selenium",  "fun"--> "A lot of fun
        sentence = sentence.replace("java", "selenium").replace("fun", "A lot of fun");
        System.out.println("sentence = " + sentence);


        String result = "1-48 of over 4,000 results for java book";
        result = result.replace("1-48 of over ","")
                .replace(",","")
                .replace(" results for java book","");

        System.out.println("result = " + result);
    }
}