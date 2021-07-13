package day19_classes_vs_object_strings;

import java.util.Locale;

public class StringCaseConversionMethods {
 /**
 toLowerCase() -> converts all letters to lowercase
 toUpperCase () -> converts all letters to uppercase
  String word = "Java";
  System.out.println(word.toLowerCase());
  OUTPUT:java
  System.out.println(word.toUpperCase());
  OUTPUT:JAVA
  */
 public static void main(String[] args) {


        String word = "CyberTek";
        String sentence = "123 Java IS Fun!";
        System.out.println(word);
    //convert word to all lowercase
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

    String wordInLcase = word.toLowerCase();
        System.out.println("wordInLCase = " + wordInLcase);
    //change word to all lowercase letters. and assign back
    word = word.toLowerCase();
        System.out.println("word = " + word);


        String company ="Amazon";
     System.out.println(company.toUpperCase());
     System.out.println("company in uppercase - "+company.toUpperCase());
     System.out.println("Amazon".toUpperCase());

     //change variable company "Amazon" to "AMAZON"
     System.out.println("company - "+company);
     company=company.toUpperCase();
     System.out.println("company - "+company);
 }
}
