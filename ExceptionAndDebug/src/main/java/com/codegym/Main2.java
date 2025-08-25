package com.codegym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
//        try {
//            System.out.println("Nhập 1 số: ");
//            Scanner input = new Scanner(System.in);
//            int a = input.nextInt();
//            System.out.println(a);
//        } catch (InputMismatchException inputMismatchException) { // bắt ngoại lệ 1
//            System.out.println("Nhập số bạn ơi");
//        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) { // bắt ngoại lệ 2
//            System.out.println("Truy cập ngoài mảng rồi");
//        }
//        System.out.println("Tiếp tục chương trình");

        try {
            System.out.println("Nhập 1 số: ");
            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            System.out.println(a);
        } catch (InputMismatchException inputMismatchException) {
            System.out.println("Sai định dạng, Vui lòng nhập lại");
        } catch (Exception e) {
            System.out.println("Something went wrong: main.err: " + e.getMessage());
        } finally { // Code dù đúng hay sai thì cũng thực hiện khối này
            System.out.println("Thực hiện kối finally");
            // Tác dụng:
            // Tương tác với database, file hệ thống, 1 bên thứ 3 (Connection) => Thực hiện đóng kết nối sau khi hoàn thành tác vụ
        }
        // Cách sử dụng try catch.
        // Cho chương trình ném exception rồi quay lại xử lý
        // Có thể xử dụng catch Exception nhưng luôn cần log kém theo.

        // AWS => Dùng bao nhiêu trả bấy nhiêu (dùng ít => tiền ít) - 7$ => 1 error
        // Gói => giới hạn bởi gói
    }
}
