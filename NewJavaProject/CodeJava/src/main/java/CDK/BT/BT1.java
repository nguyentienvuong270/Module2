package CDK.BT;

import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("=== MENU ===");
            System.out.println("1. In hình chữ nhật");
            System.out.println("2. In tam giác vuông");
            System.out.println("3. In tam giác cân");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    inHinhChuNhat(4, 6);
                    break;
                case 2:
                    inTamGiacVuong();
                    break;
                case 3:
                    inTamGiacCan(5); // chiều cao = 5
                    break;
                case 4:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 4);

        sc.close();
    }


    public static void inHinhChuNhat(int chieuCao, int chieuRong) {
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < chieuRong; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void inTamGiacVuong() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn vị trí góc vuông:");
        System.out.println("1. Trên trái");
        System.out.println("2. Trên phải");
        System.out.println("3. Dưới trái");
        System.out.println("4. Dưới phải");
        int type = sc.nextInt();
        int size = 5;

        switch (type) {
            case 1: // Trên trái
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 2: // Trên phải
                for (int i = size; i >= 1; i--) {
                    for (int j = 1; j <= size - i; j++) System.out.print("  ");
                    for (int j = 1; j <= i; j++) System.out.print("* ");
                    System.out.println();
                }
                break;
            case 3: // Dưới trái
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= i; j++) System.out.print("* ");
                    System.out.println();
                }
                break;
            case 4: // Dưới phải
                for (int i = 1; i <= size; i++) {
                    for (int j = 1; j <= size - i; j++) System.out.print("  ");
                    for (int j = 1; j <= i; j++) System.out.print("* ");
                    System.out.println();
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
        }
    }


    public static void inTamGiacCan(int chieuCao) {
        for (int i = 1; i <= chieuCao; i++) {
            for (int j = 1; j <= chieuCao - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }
}
