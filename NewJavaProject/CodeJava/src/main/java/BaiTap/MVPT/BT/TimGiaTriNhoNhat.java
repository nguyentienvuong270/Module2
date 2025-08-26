package BaiTap.MVPT.BT;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int size = scanner.nextInt();

        int[] mang = new int[size];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int min = mang[0];

        for (int i = 1; i < size; i++) {
            if (mang[i] < min) {
                min = mang[i];
            }
        }

        System.out.println("\nGiá trị nhỏ nhất trong mảng là: " + min);
    }
}
