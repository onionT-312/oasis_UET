import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long idNumber;
    private String fullName;
    private final List<Account> accountList;

    public Customer() {
        this.idNumber = 0;
        this.fullName = "";
        this.accountList = new ArrayList<>();
    }

    public Customer(long idNumber, String fullName) {
        this.idNumber = idNumber;
        this.fullName = fullName;
        this.accountList = new ArrayList<>();
    }

    public String getCustomerInfo() {
        return String.format(
                "Số CMND: %d. Họ tên: %s.",
                this.idNumber,
                this.fullName
        );
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }
    public void removeAccount(Account account) {
        this.accountList.remove(account);
    }
    public long getIdNumber() {
        return idNumber;
    }
    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public List<Account> getAccountList() {
        return accountList;
    }
}
