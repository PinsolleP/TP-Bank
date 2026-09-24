public class Main {

    public static void main(String[] args) {

        Person person = new Person(1, "Pinsolle", "Paul");

        BankAccount account1 = new BankAccount("FR-1234-5678");
        BankAccount account2 = new BankAccount("FR-9876-5432");

        System.out.println("Solde initial : " + account1.getBalance());

        account1.deposit(100);

        for (Operation operation : account1.getOperations()){
            System.out.println(operation.getType() + " - " + operation.getAmount());
        }

        System.out.println("Après dépôt : " + account1.getBalance());

        account1.withdraw(30);

        for (Operation operation : account1.getOperations()){
            System.out.println(operation.getType() + " - " + operation.getAmount());
        }

        System.out.println("Après retrait : " + account1.getBalance());

        account1.transfer(account2, 20);

        System.out.println("Solde account1 : " + account1.getBalance());
        System.out.println("Solde account2 : " + account2.getBalance());

        try {
            account1.withdraw(100);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        person.addBankAccount(account1);
        person.addBankAccount(account2);

        System.out.println("Nombre de compte : " + person.getBank_accounts().size());
        System.out.println(account1.getOwner().getFirst_name());

        System.out.println("historique du compte : " + account1.getAccount_number() + " " + account1.getOperations());
        System.out.println("historique du compte : " + account2.getAccount_number() + " " + account2.getOperations());

    }
}
