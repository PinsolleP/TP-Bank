import java.util.ArrayList;
import java.util.List;

public class Person {

    private int id_person;
    private String first_name;
    private String last_name;
    private List<BankAccount> bank_accounts;

    public Person(int id_person, String first_name, String last_name) {
        this.id_person = id_person;
        this.first_name = first_name;
        this.last_name = last_name;
        this.bank_accounts = new ArrayList<>();
    }

    public int getId_person() {
        return id_person;
    }

    public void setId_person(int id_person) {
        this.id_person = id_person;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public List<BankAccount> getBank_accounts() {
        return bank_accounts;
    }

    public void addBankAccount(BankAccount account){
        bank_accounts.add(account);
        account.setOwner(this);
    }
}
