package com.codegym;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        /*
        int number1 = 4;
        int number2 = 0;
        System.out.println("Thuc hien pheps tinh"); // logging
        int result = number1 / number2;
        System.out.println("Ket qua la" + result);
        System.out.println(number1 / number2);
        System.out.println("Hello");
        // ping team => ping dong doi => tim bug => fix bug
         */
//        getEx();
//        System.out.println("Hello");
//        int a = 4;
//        int b = 0;
//        if (b == 0) throw new ArithmeticException("/ by zero");
        // runtime exception sẽ không bắt buộc phải xử lý quá trình viết code (Unchecked Exception)
        String name = "hehe";
        System.out.println(name.charAt(4));
    }

    public static void getEx() throws IOException {
        try { // sử dụng khối try-catch để giải quyết ngoại lệ tại hàm nay
            // code in here...
            throw new IOException("Test"); // nội
        /*
        + Throw: được sử dụng để ném ra ngoài lệ và đặt bên trong hàm
        + Throws: Được sử dụng để báo hàm này có thể tungẩ danh lỗi tương ứng
        và viết sau tên hàm (Nhường việc xử lý cho các hàm gọi nó)
         */
            // code in here...
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}