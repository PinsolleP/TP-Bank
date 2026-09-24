public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("FR-1234-5678");
        BankAccount account2 = new BankAccount("FR-9876-5432");

        System.out.println("Solde initial : " + account1.getBalance());

        account1.deposit(100);

        System.out.println("Après dépôt : " + account1.getBalance());

        account1.withdraw(30);

        System.out.println("Après retrait : " + account1.getBalance());

        account1.transfer(account2, 20);

        System.out.println("Solde account1 : " + account1.getBalance());
        System.out.println("Solde account2 : " + account2.getBalance());

        try{
            account1.withdraw(100);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
