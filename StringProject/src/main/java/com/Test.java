package com;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
//        String name = "Linh";
//        System.out.println(name.length()); // lấy độ dài
//        System.out.println(name.isEmpty()); // kiểm tra chuỗi rỗng hay k
//        String name02 = new String("Linh");
//        System.out.println(name.equals(name02)); // so sánh giá trị
//        System.out.println(name.charAt(1)); // name[1]
//        String name03 = "    Linh           ";
//        System.out.println(name03.trim());
//        String name04 = "LINH";
//        String name05 = "linh";
//        System.out.println(name04.equalsIgnoreCase(name05));
//        // split => biến chuỗi thành 1 mảng String
//        System.out.println(name05.contains("a")); // kiểm tra chuỗi gốc có chứa chuỗi này hay k
        // matches; kiểm tra regex (mẫu chuỗi)
        // 4 ký tự, không chứa ký tự đặc biet =>

        System.out.println("Nhập mật khẩu:");
        Scanner input = new Scanner(System.in);
        String pwd = input.nextLine();

        String regex = "^(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9])(?=.*?[#?!@$%^&*-]).{8,}$";
        String emailRegex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        if(pwd.matches(regex)) {
            System.out.println("Hợp lệ");
        } else  {
            System.out.println("Không hợp lệ");
            System.out.println("Nhập ít nhất 1 ký tự hoa...");
        }
    }
}
