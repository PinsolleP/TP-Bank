public class BankAccount {

    private String account_number;
    private double balance;

    public BankAccount(String account_number) {
        this.account_number = account_number;
        this.balance = 0;
    }

    public String getAccount_number() {
        return account_number;
    }

    public void setAccount_number(String account_number) {
        this.account_number = account_number;
    }

    public double getBalance() {
        return balance;
    }

}
