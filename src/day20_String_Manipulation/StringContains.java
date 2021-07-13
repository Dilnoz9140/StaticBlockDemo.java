package day20_String_Manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company ="Capital one";
        System.out.println(company.contains("i"));//true
        System.out.println(company.contains("ital"));//true
        System.out.println(company.contains("l o"));//true
        System.out.println(company.contains("l o"));//
        System.out.println(company.contains("One"));// false

    }
}
