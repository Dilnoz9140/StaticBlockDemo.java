package day32_array_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words="java : python : selenium : html";
        String[]wordsArray=words.split(":");
        System.out.println((Arrays.toString(wordsArray)));
        System.out.println("length of array = "+wordsArray.length);
       for( String each : wordsArray) {
           System.out.println(each);
       }

      //  String sentence="today i am coding java arrays";
        //String[] wordsInSentence = sentence.split(" ");
      //  System.out.println("first word: "+wordsInSentence[0]);;
      //  System.out.println("number of words in sentence = "+wordsInSentence.length);
       // for( String each : wordsInSentence){
          //  System.out.println(each);

            String sentence="today i am coding java arrays";
        System.out.println("first word: "+sentence.split(" ")[0]);
        System.out.println("number of words in sentence = "+sentence.split(" ")[0].length());
        for( String each :sentence.split(" ") ){
            System.out.println(each);
        }
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] results = googleResult.split(" ");
        System.out.println(Arrays.toString(results));
        System.out.println("Count = " + results[1]);
       System.out.println("Seconds = " + results[3].replace("(",""));
        System.out.println("Seconds = " + results[3].substring(1));
    }
}
