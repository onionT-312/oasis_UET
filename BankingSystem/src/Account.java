import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Account {
    public static final String CHECKING = "CHECKING";
    public static final String SAVINGS = "SAVINGS";
    protected double balance;
    protected long accountNumber;
    protected List<Transaction> transactionList;

    public Account(long accountNumber, double balance) {
        this.balance = 0;
        this.accountNumber = 0;
        this.transactionList = new ArrayList<Transaction>();
    }

    public Account(long balance, long accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public String getCHECKING() {
        return CHECKING;
    }

    public String getSAVINGS() {
        return SAVINGS;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public List<Transaction> getTransactionList() {
        return transactionList;
    }

    public void setTransactionList(List<Transaction> transactionList) {
        this.transactionList = transactionList;
    }

    public void doWithdraw(double amount) {
        this.balance -= amount;
    }

    public void doDepositing(double amount) {
        this.balance += amount;
    }

//    public abstract void doWithdrawing(double amount);

    public abstract void withdraw(double amount) throws BankException;

    public abstract void deposit(double amount) throws BankException;

    public String getTransactionHistory() {
        StringBuilder history = new StringBuilder();
        history.append(String.format("Lịch sử giao dịch của tài khoản %d:\n", accountNumber));
        for (Transaction transaction : transactionList) {
            history.append(transaction.getTransactionSummary()).append("\n");
        }
        return history.toString();
    }

    public void addTransaction(Transaction transaction) {
        this.transactionList.add(transaction);
    }


    //    public boolean equals(Object obj) {
//        if (obj == this) {
//            return true;
//        }
//        if (!(obj instanceof Account)) {
//            return false;
//        }
//        Account other = (Account) obj;
//        return accountNumber == other.accountNumber;
//    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return balance == account.balance && accountNumber == account.accountNumber && Objects.equals(CHECKING, account.CHECKING) && Objects.equals(SAVINGS, account.SAVINGS) && Objects.equals(transactionList, account.transactionList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(CHECKING, SAVINGS, balance, accountNumber, transactionList);
    }
}
