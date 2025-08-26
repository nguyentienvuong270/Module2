package BaiTap.MVPT.BT;

import java.util.Scanner;

public class TimGiaTriLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int hang = scanner.nextInt();

        System.out.print("Nhập số cột của ma trận: ");
        int cot = scanner.nextInt();

        double[][] maTran = new double[hang][cot];

        System.out.println("Nhập các phần tử của ma trận:");
        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                System.out.print("Phần tử [" + i + "][" + j + "]: ");
                maTran[i][j] = scanner.nextDouble();
            }
        }

        double max = maTran[0][0];
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < hang; i++) {
            for (int j = 0; j < cot; j++) {
                if (maTran[i][j] > max) {
                    max = maTran[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("\nGiá trị lớn nhất trong ma trận là: " + max);
        System.out.println("Tọa độ của giá trị này là: [" + maxRow + "][" + maxCol + "]");
    }
}
