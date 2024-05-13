public class CheckingAccount extends Account {
    public CheckingAccount(long accountNumber, double balance) {
        super(accountNumber, balance);
        this.accountNumber = accountNumber;
        this.balance = balance;
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
    public void withdraw(double amount) throws BankException {
        if (amount < 0 || amount > balance) {
            throw new InsufficientFundsException(amount);
        }
        balance -= amount;
        addTransaction(new Transaction(Transaction.TYPE_WITHDRAW_CHECKING, amount, balance + amount, balance));
    }

    @Override
    public void deposit(double amount) throws BankException {
        if (amount < 0) {
            throw new InvalidFundingAmountException(amount);
        }
        balance += amount;
        addTransaction(new Transaction(Transaction.TYPE_DEPOSIT_CHECKING, amount, balance - amount, balance));
    }

}
