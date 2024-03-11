import java.util.ArrayList;
import java.util.Objects;

public class Account {
    private double balance;
    private ArrayList<Transaction> transitionList;

    public Account() {
        balance = 0;
        transitionList = new ArrayList<Transaction>();
    }

    private void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban nap vao khong hop le!");
        }
        this.balance += amount;
    }

    private void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien ban rut ra khong hop le!");
        } else if (amount > this.balance) {
            System.out.println("So tien ban rut vuot qua so du!");
        }
        this.balance -= amount;
    }

    /**
     * add transaction.
     *
     * @param amount    amount
     * @param operation operation
     */
    public void addTransaction(double amount, String operation) {
        if (Objects.equals(operation, Transaction.DEPOSIT)) {
            this.deposit(amount);
        } else if (Objects.equals(operation, Transaction.WITHDRAW)) {
            this.withdraw(amount);
        } else {
            System.out.println("Yeu cau khong hop le!");
        }
        Transaction newTransaction = new Transaction(operation, amount, this.balance);
        transitionList.add(newTransaction);
    }

    /**
     * print transaction.
     */
    public void printTransaction() {
        for (Transaction i : transitionList) {
            double roundBalance = (double) Math.round(i.getBalance() * 100) / 100;
            double roundAmount = (double) Math.round(i.getAmount() * 100) / 100;

            String operation =
                    Objects.equals(i.getOperation(), "deposit") ? "Nap tien" : "Rut tien";
            System.out.printf("Giao dich %d: %s $%.2f. So du luc nay: $%.2f.\n",
                    transitionList.indexOf(i) + 1, operation, roundAmount, roundBalance);
        }
    }
}
