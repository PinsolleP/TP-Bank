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
}
