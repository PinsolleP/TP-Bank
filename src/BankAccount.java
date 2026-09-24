public class BankAccount {

    private String account_number;
    private double balance;

    public BankAccount(String account_number) {
        boolean valid_account = account_number.matches("^FR-[0-9]{4}-[0-9]{4}$");
        if (!valid_account){
            throw new IllegalArgumentException("Le numéro de compte est invalide.");
        }
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

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Le montant d'un dépôt doit être supérieur à 0.");
        }
        balance += amount;
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Le montant d'un retrait doit être supérieur à 0.");
        }
        if ( amount > balance) {
            throw new IllegalArgumentException(("Solde insuffisant."));
        }
        balance -= amount;
    }

    public void transfer(BankAccount destination, double amount){

        this.withdraw(amount);
        destination.deposit(amount);
    }



}
