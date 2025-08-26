package BaiTap.MVPT.BT;

import java.util.Scanner;

public class ThemPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int n = 6;
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6;
        arr[3] = 7;
        arr[4] = 8;
        arr[5] = 0;

        System.out.print("Nhập giá trị cần chèn: ");
        int x = sc.nextInt();

        System.out.print("Nhập vị trí cần chèn (0.." + n + "): ");
        int index = sc.nextInt();

        if (index < 0 || index > n || n == arr.length) {
            System.out.println("Không thể chèn phần tử vào mảng!");
        } else {
            for (int i = n; i > index; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
            n++;

            System.out.println("Mảng sau khi chèn:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
