import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Bank {
    private final List<Customer> customerList;

    public Bank() {
        this.customerList = new ArrayList<>();
    }

    public void readCustomerList(InputStream inputStream) {
        Scanner sc = new Scanner(inputStream);
        String readLine;

        if (sc.hasNextLine()) {
            readLine = sc.nextLine();
        } else {
            return;
        }
        // Loop for reading Customer info
        while (sc.hasNextLine()) {
            assert readLine != null;
            String[] partsCustomer = readLine.split(" ");
            StringBuilder customerName = new StringBuilder();
            long customerId = 0;

            for (String part : partsCustomer) {
                char firstChar = part.charAt(0);
                if (!Character.isDigit(firstChar)) {
                    if (customerName.toString().isEmpty()) {
                        customerName.append(part);
                    } else {
                        customerName.append(" ").append(part);
                    }
                } else {
                    customerId = Long.parseLong(part);
                }
            }

            Customer newCustomer = new Customer(customerId, customerName.toString());
            // Loop for reading the Customer's Account(s)
            while (
                    sc.hasNextLine()
                            && (readLine = sc.nextLine()) != null
                            && Character.isDigit(readLine.charAt(0))
            ) {
                String[] partsAccount = readLine.split(" ");

                long accountId = Long.parseLong(partsAccount[0]);
                String operation = partsAccount[1];
                double balance = Double.parseDouble(partsAccount[2]);

                try {
                    if (Objects.equals(operation, "CHECKING")) {
                        newCustomer.addAccount(new CheckingAccount(accountId, balance));
                    } else if (Objects.equals(operation, "SAVINGS")) {
                        newCustomer.addAccount(new SavingsAccount(accountId, balance));
                    } else {
                        throw new IllegalArgumentException("Invalid account type: " + operation);
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println(e.toString());
                    return;
                }
            }

            // Check if Customer already exists in CustomerList
            // If so, add the Account(s) to the existing Customer
            boolean found = false;
            for (Customer customer : customerList) {
                if (customer.getIdNumber() == customerId) {
                    for (Account account : newCustomer.getAccountList()) {
                        customer.addAccount(account);
                    }
                    found = true;
                    break;
                }
            }

            // If Customer does not exist in CustomerList
            // Add the Customer along with their account(s)
            if (!found) {
                customerList.add(newCustomer);
            }
        }
    }

    public String getCustomersInfoByIdOrder() {
        if (!customerList.isEmpty()) {
            customerList.sort((c1, c2) -> Long.compare(c1.getIdNumber(), c2.getIdNumber()));
            return customersInfoString();
        } else {
            return "";
        }
    }

    public String getCustomersInfoByNameOrder() {
        if (!customerList.isEmpty()) {
            customerList.sort((c1, c2) -> c1.getFullName().compareTo(c2.getFullName()));
            return customersInfoString();
        } else {
            return "";
        }
    }

    private String customersInfoString() {
        StringBuilder customersInfo = new StringBuilder();
        for (Customer customer : customerList) {
            if (customersInfo.length() == 0) {
                customersInfo.append(customer.getCustomerInfo());
            } else {
                customersInfo.append("\n").append(customer.getCustomerInfo());
            }
        }

        return customersInfo.toString();
    }

    public List<Customer> getCustomerList() {
        return this.customerList;
    }
}
