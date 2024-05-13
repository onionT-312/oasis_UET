public class Transaction {
    private final int type;
    private final double amount;
    private final double initialBalance;
    private double finalBalance;

    public static final int TYPE_DEPOSIT_CHECKING = 1;
    public static final int TYPE_WITHDRAW_CHECKING = 2;
    public static final int TYPE_DEPOSIT_SAVINGS = 3;
    public static final int TYPE_WITHDRAW_SAVINGS = 4;

    public Transaction(int type, double amount, double initialBalance, double finalBalance) {
        this.type = type;
        this.amount = amount;
        this.initialBalance = initialBalance;
        this.finalBalance = finalBalance;
    }

    public String getTransactionTypeString(int type) {
        switch (type) {
            case 1:
                return "Nạp tiền vãng lai";
            case 2:
                return "Rút tiền vãng lai";
            case 3:
                return "Nạp tiền tiết kiệm";
            case 4:
                return "Rút tiền tiết kiệm";
            default:
                return "Không xác định";
        }
    }

    public String getTransactionSummary() {
        return String.format("- Kiểu giao dịch: %s. Số dư ban đầu: $%.2f. " +
                        "Số tiền: $%.2f. Số dư cuối: $%.2f.",
                getTransactionTypeString(this.type),
                this.initialBalance,
                this.amount,
                this.finalBalance
        );
    }
}
