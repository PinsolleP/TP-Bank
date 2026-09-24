import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BankAccount {

    private String account_number;
    private double balance;
    private Person owner;
    private List<Operation> operations;

    public BankAccount(String account_number) {
        if ( account_number == null || !account_number.matches("^FR-[0-9]{4}-[0-9]{4}$")){
            throw new IllegalArgumentException("Le numéro de compte est invalide.");
        }
        this.account_number = account_number;
        this.balance = 0;
        this.operations = new ArrayList<>();
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

    public Person getOwner() {
        return owner;
    }

    public void setOwner( Person owner){
        this.owner = owner;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void deposit(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Le montant d'un dépôt doit être supérieur à 0.");
        }
        balance += amount;

        Operation operation = new Operation(
                1,
                OperationType.DEPOSIT,
                amount,
                new Date(),
                null,
                this
        );
        operations.add(operation);
    }

    public void withdraw(double amount){
        if (amount <= 0){
            throw new IllegalArgumentException("Le montant d'un retrait doit être supérieur à 0.");
        }
        if ( amount > balance) {
            throw new IllegalArgumentException(("Solde insuffisant."));
        }
        balance -= amount;

        Operation operation = new Operation(
                2,
                OperationType.WITHDRAWAL,
                amount,
                new Date(),
                this,
                null
        );
        operations.add(operation);
    }

    public void transfer(BankAccount destination, double amount){

        if (destination == null){
            throw new IllegalArgumentException("Le compte destinataire n'existe pas.");
        }

        if( destination == this){
            throw new IllegalArgumentException("Le compte source et le compte destinataire doivent être différents.");
        }

        if (amount <= 0){
            throw new IllegalArgumentException("Le montant d'un retrait doit être supérieur à 0.");
        }
        if ( amount > balance) {
            throw new IllegalArgumentException(("Solde insuffisant."));
        }

        removeBalance(amount);
        destination.addBalance(amount);

        Operation operation = new Operation(
                3,
                OperationType.TRANSFER,
                amount,
                new Date(),
                this,
                destination
        );
        this.addOperation(operation);
        destination.addOperation(operation);

    }

    public void addOperation(Operation operation){
        operations.add(operation);
    }

    private void removeBalance(double amount){
        balance -= amount;
    }

    private void addBalance(double amount){
        balance += amount;
    }

}
