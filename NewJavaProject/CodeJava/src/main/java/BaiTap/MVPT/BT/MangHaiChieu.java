package BaiTap.MVPT.BT;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận vuông (n x n): ");
        int n = scanner.nextInt();

        double[][] maTran = new double[n][n];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextDouble();
            }
        }

        double tong = 0;
        for (int i = 0; i < n; i++) {
            tong += maTran[i][i];
        }

        System.out.println("Tổng các phần tử trên đường chéo chính là: " + tong);
    }
}
