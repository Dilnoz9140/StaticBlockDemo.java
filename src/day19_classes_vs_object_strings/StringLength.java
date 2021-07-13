package day19_classes_vs_object_strings;

public class StringLength {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word);
        System.out.println(word.length());
        System.out.println("count: " +word.length());
        System.out.println("wooden spoon".length());
        String firstName="Dilnoza";
        System.out.println((firstName +"-" +firstName.length()));
        int count = firstName.length();
        System.out.println("count = "+count);
        String password = "abc123";
        /** IF STATEMENT:
         * when password is at least 6 characters:
         * print: valid amazon password
         * else
         * print :password to short
         */
        if (password.length()>=6) {
            System.out.println("Valid amazon password");
        }else{
            System.out.println("password must be at least 6 characters");
        }
    }

}
