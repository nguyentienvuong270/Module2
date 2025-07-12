package CDK.BT;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng số nguyên tố cần in ra: ");
        int soLuong = scanner.nextInt();

        int count = 0;

        int N = 2;

        while (count < soLuong) {
            if (laSoNguyenTo(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
        }

        scanner.close();
    }

    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
