package com.codegym;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        /*
        Viết 1 đoạn code yêu cầu người dùng nhập vào 1 lựa chọn
        sai định dạng thì yêu cầu nhập lại, bằng 0 thì thoát chương trình.
         */
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            try {
                System.out.println("============== Menu ==============");
                System.out.println("1. Cơm");
                System.out.println("2. Cá");
                System.out.println("0. Thoát chương trình");
                System.out.println("Vui lòng nhập lựa chọn của bạn");
                choice = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập sai định dạng yêu cầu nhập lại ");
                choice = -1;
            }
        } while (choice != 0);
    }
    // Thêm vào bài quản lý và buổi sau sẽ chữa quản lý năng.
}
