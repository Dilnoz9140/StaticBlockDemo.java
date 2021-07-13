package day19_classes_vs_object_strings;

public class StringStarsEndWith {
    public static void main(String[] args) {

        String name = "Mr. Adam";
        if (name.startsWith("Mr.")) {
            System.out.println("Man");
        } else if (name.startsWith("Dr.")) {
            System.out.println("Doctor");
        } else if (name.startsWith("Mrs.")) {
            System.out.println("Married Woman");
        } else if (name.startsWith("Ms.")) {
            System.out.println("Single Women");
        } else if (name.startsWith("Sr.")) {
            System.out.println("Senior");
        } else {
            System.out.println("normal name");
        }
        name = "https://www.tesla.com";
        if (name.endsWith("Commercial website")) {
            System.out.println("Man");
        } else if (name.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (name.endsWith(".gov")) {
            System.out.println("Goverment website");
        } else if (name.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (name.endsWith(".org")) {
            System.out.println("Organization website");
        } else  {
            System.out.println("Inbvalid website");
        
        }
    }
}