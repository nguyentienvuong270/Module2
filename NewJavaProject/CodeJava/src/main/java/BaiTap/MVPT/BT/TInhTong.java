package BaiTap.MVPT.BT;

import java.util.Scanner;

public class TInhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng: ");
        int hang = scanner.nextInt();

        System.out.print("Nhập số cột: ");
        int cot = scanner.nextInt();

        double[][] mang = new double[hang][cot];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                mang[i][j] = scanner.nextDouble();
            }
        }

        int chiSoCot;
        do {
            System.out.print("Nhập chỉ số cột cần tính tổng (từ 0 đến " + (cot - 1) + "): ");
            chiSoCot = scanner.nextInt();
        } while (chiSoCot < 0 || chiSoCot >= cot); // kiểm tra hợp lệ

        double tong = 0;
        for (int i = 0; i < hang; i++) {
            tong += mang[i][chiSoCot];
        }

        System.out.println("Tổng các phần tử ở cột " + chiSoCot + " là: " + tong);
    }

}
