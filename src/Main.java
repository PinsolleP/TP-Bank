public class Main {

    public static void main(String[] args) {

        BankAccount account1 = new BankAccount("FR-1234-5678");

        System.out.println("Solde initial : " + account1.getBalance());

        account1.deposit(100);

        System.out.println("Après dépôt : " + account1.getBalance());

    }
}
