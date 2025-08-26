package BaiTap.MVPT.BT;

import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int n = 10;

        System.out.print("Nhập phần tử cần xóa: ");
        int x = sc.nextInt();

        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        if (index_del == -1) {
            System.out.println("Không tìm thấy phần tử " + x + " trong mảng.");
        } else {
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Mảng sau khi xóa " + x + ":");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
