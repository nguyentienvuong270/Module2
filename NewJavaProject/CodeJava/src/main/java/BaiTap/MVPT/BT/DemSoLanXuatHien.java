package BaiTap.MVPT.BT;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String chuoi = "lap trinh java co ban";

        System.out.print("Nhập một ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Ký tự '" + kyTu + "' xuất hiện " + count + " lần trong chuỗi.");
    }
}
