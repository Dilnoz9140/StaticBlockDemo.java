package day38_methods;
import static day38_methods.StringUtils.*;//import all static methods ,so that you
public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";

        if (StringUtils.isNullOrEmpty(userName)) {
            System.out.println("Fail: user name cannot be null or empty");

        }
        System.out.println("isPalindrome(civiv) = "+ StringUtils.isPalindrome("civic"));
        System.out.println("isPlaindrome(kayak) = "+isPalindrome("kayak"));
        System.out.println("isPlaindrome(Cybertek) = "+isPalindrome("Cybertek"));

        String name ="noza";
        String revName= StringUtils.reverse(name);
        System.out.println(revName);
        System.out.println(StringUtils.reverse(name));



    }
}