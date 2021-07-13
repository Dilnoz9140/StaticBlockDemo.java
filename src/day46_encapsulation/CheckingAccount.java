package day46_encapsulation;

public class CheckingAccount {
    private double balance;
    private long  accountNumber;
    private String accountHolder;
    private String type = "checking";//default is checking ,we can change if needed using setter

    /**
     * public void setAccountInfo(long accountNumber,String accountHolder, double balance,String type)
     * 1) this.accountNumber = accountNumber;
     * 2) setAccountNumber(accountNumber);
     */

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public void setType(String type) {
        this.type = type;
    }
//right click> genenrate >Getter and Setter>Select all > Ok

    public double getBalance() {
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
    public void setAccountInfo(long accountNumber,String accountHolder, double balance,String type){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.type=type;

}
public void getAccountInfo(){
        System.out.println("balance = "+ balance);
        System.out.println("accountNumber = "+ accountNumber);
        System.out.println("accounHolder= "+ accountHolder);
        System.out.println("type = "+ type);

    }

        }