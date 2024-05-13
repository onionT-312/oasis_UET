import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        // Tạo một đối tượng ngân hàng
        Bank bank = new Bank();

        // Đọc dữ liệu từ tệp và tải thông tin khách hàng vào hệ thống
        try {
            FileInputStream fis = new FileInputStream("./src/data.txt");
            bank.readCustomerList(fis);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Lấy danh sách khách hàng đã sắp xếp theo số CMND và in ra màn hình
        String customersInfoByIdOrder = bank.getCustomersInfoByIdOrder();
        System.out.println("Danh sách khách hàng theo số CMND:");
        System.out.println(customersInfoByIdOrder);

        // Lấy danh sách khách hàng đã sắp xếp theo tên và in ra màn hình
        String customersInfoByNameOrder = bank.getCustomersInfoByNameOrder();
        System.out.println("Danh sách khách hàng theo tên:");
        System.out.println(customersInfoByNameOrder);
    }
}
