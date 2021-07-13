package day19_classes_vs_object_strings;

public class LoginTest {
    public static void main(String[] args) {
        String exUserName="cybertek";
        String exPassword="Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";
        //userName is not case sensitive
        //password is case sensitive
        //
        //WHEN expUserName equals userName AND expPassword equals password
        //    -> "Pass - user successfully logged in"
        //
        //OTHERWISE:
        //    WHEN expUserName NOT equals userName
        //        -> "Incorrect Username"
        //    OTHERWISE:
        //        -> "Incorrect password"
        if (userName.equalsIgnoreCase("cybertek")&&password.equals("Abc123")) {
            System.out.println("Pass - user successfully logged in");
        } else{
            System.out.println("Incorrect password");
            System.out.println("===============================================================");
        }

        if (exUserName.equalsIgnoreCase(userName) && exPassword.equals(password)) {
            System.out.println("Pass - user logged in successfully ");
        }else {
            if(!exUserName.equalsIgnoreCase(userName)) {//boolean not true
                System.out.println("Fail - username is incorrect");
            }else{
                System.out.println("Fail - password is incorrect");
            }
        }
    }
}
