public class SavingsAccount extends Account {
    private static final double MIN_BALANCE = 1000;
    private static final double MAX_WITHDRAWAL = 5000;

    public SavingsAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
    }

//    @Override
//    public void doWithdrawing(double amount) {
//        if (amount < 0) {
//            throw new IllegalArgumentException("Invalid amount: " + amount);
//        }
//        if (amount > balance) {
//            throw new IllegalArgumentException("Insufficient funds: " + balance);
//        }
//        balance -= amount;
//    }


    @Override
    public void deposit(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;
        addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_SAVINGS, amount, balance - amount, balance));
    }

    @Override
    public void withdraw(double amount) throws BankException {
        if (amount < 0 || amount > balance || balance - amount < MIN_BALANCE || amount > MAX_WITHDRAWAL) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_SAVINGS, amount, balance + amount, balance));
    }

}
