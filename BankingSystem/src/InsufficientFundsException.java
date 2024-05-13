public class InsufficientFundsException extends BankException {
    public InsufficientFundsException() {
        super();
    }

    public InsufficientFundsException(double amount) {
        super(String.format("Số dư tài khoản không đủ $%.2f để thực hiện giao dịch",
                amount));
    }
}
