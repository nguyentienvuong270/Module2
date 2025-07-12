package codegymMD2;

import java.util.Scanner;

public class Main {
    // Gõ nhanh hàm main: psvm or main + Tab
    public static void main(String[] args) {
        // Code in here
        /*
        Số nguyên: int
        Chuỗi: String
        Số thực: double hoặc float
        Ký tự: char
        Logic: boolean
         */
        int number; // Kiểu dữ liệu quy định khi khai báo biến
        // <data_type> <ten_bien>
        number = 5;
        double number02 = 4.5, number03, number04 = 10.5; // Khai báo nhiều biến
        boolean isSick = true;
        String text = "Mệt một chút";
        char character = 'r';
        // _ $
        String _a = "abc";
        String $b = "abc";
        String classOfCodeGym = "C04";
        // Tránh các từ khóa: for, while, do while, class, new,....
        // int while = 40; Error

        // In ra: sout + Tab
        /*
        System.out.println("Hello world");
        */

        // Nhập vào: Sử dụng Scaner
        Scanner inputNumber = new Scanner(System.in); // Khai báo 1 đối tượng cho phép lấy dữ liệu từ bàn phím
        Scanner inputStr = new Scanner(System.in);

        System.out.println("Vui lòng nhập 1 số");
        int n = inputNumber.nextInt(); // Yêu cầu người dùng nhập dữ liệu:
        System.out.println("n = " + n); //

        System.out.println("Vui lòng nhập 1 số thực: ");
        double d = inputNumber.nextDouble(); // 6.5 + Enter (/n)
        System.out.println("d = " + d);

        System.out.println("Nhập gì hay ho đi");
        String s = inputStr.nextLine(); // "" + Enter (/n) (Dùng chung input)
        System.out.println("s = " + s);

        System.out.println("Nhập gì hay ho tiếp đi");
        String s2 = inputStr.nextLine();
        System.out.println("s2 = " + s2);

        /*
        Có 2 cách:
        + Cách 1: Đặt nhập chuỗi lên đâu
        + Cách 2: Tạo 1 input cho số và 1 input cho chữ
         */
    }
}