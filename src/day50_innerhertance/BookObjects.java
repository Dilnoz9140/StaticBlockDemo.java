package day50_innerhertance;

public class BookObjects {
    public static void main(String[] args) {
        Book EBook = new Book();
        EBook.title = "intro to java";
        EBook.author = "Savitch";
        EBook.type= "programming";
        EBook.price = 85.0;

        System.out.println(EBook.title);
        System.out.println(EBook.author);
        System.out.println(EBook.type);
        System.out.println(EBook.price);
        System.out.println("----------------------------------");

        AudioBook audioBook = new AudioBook();
        audioBook.author = "Unmesh" ;
        audioBook.length = 60;
        audioBook.narrator = "Irina";
        audioBook.title = "Selenium Cookbook";
        audioBook.type = "Automation";
        audioBook.listen();
        System.out.println("---------------------------------");

        EBook eBook = new EBook();
        EBook.title = "intro to java";
        EBook.author = "Savitch";
        EBook.type= "programming";
        EBook.price = 85.0;
        eBook.size = 2;
        eBook.pages = 1000;
        eBook.readBook();




    }

}
