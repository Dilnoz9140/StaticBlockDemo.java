package day46_encapsulation;

public class CapitalOne {
    public static void main(String[]args){
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(47444711599547L);
        acc.setBalance(477.70);
        acc.setAccountHolder("Mike Smith");
        acc.setType("147 Checking");

        System.out.println("acc = " + acc);
        acc.setAccountInfo(4744110301050407L,"Adam Smith",77747474.7,"147 cheking");
        acc.getAccountInfo();
        System.out.println(acc);
    }

}
