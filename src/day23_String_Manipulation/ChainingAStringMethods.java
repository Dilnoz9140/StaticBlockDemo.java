package day23_String_Manipulation;

import java.util.Locale;

public class ChainingAStringMethods {
    public static void main(String[] args) {
        String word = " woo den sp oon ";

        System.out.println(word.toUpperCase().toLowerCase().length());

        // remowes space first print everything uppercase
        System.out.println(word.replace(" ","").toUpperCase());

        // selenium.findElement(By.id("hi")).click();

        String city="kAbUL";
                //read 1st letter.make uppercase   +read 2 nd till.make lowercase
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());

        String capitalized = city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase();
        System.out.println("capitalized = "+capitalized);

        //.isEmpty().toUpperCase() Does not work since isEmpty is boolean

    }
}
