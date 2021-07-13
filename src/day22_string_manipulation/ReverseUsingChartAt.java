package day22_string_manipulation;

public class ReverseUsingChartAt {
    public static void main(String[] args) {
        String word = "java";

        System.out.println(""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0));
        String reversed = ""+word.charAt(3)+word.charAt(2)+word.charAt(1)+word.charAt(0);
        System.out.println("word = "+word);
        System.out.println("reversed = "+reversed);

        if(word.equalsIgnoreCase(reversed)){
            System.out.println("palindrome");
        }else{
            System.out.println("not A palindrome");
        }

    }
}
