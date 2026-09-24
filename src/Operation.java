import java.util.Date;

public class Operation {

    private int id_operation;
    private OperationType type;
    private double amount;
    private Date date;

    public Operation(int id_operation, OperationType type, double amount, Date date) {
        this.id_operation = id_operation;
        this.type = type;
        this.amount = amount;
        this.date = date;
    }

    public int getId_operation() {
        return id_operation;
    }

    public void setId_operation(int id_operation) {
        this.id_operation = id_operation;
    }

    public OperationType getType() {
        return type;
    }

    public void setType(OperationType type) {
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}


