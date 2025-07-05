package ITJ.BT;

import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
        double tigia = 23000;
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap gia USD ");
        double usd = inputNumber.nextDouble();

        double vnd = tigia*usd;
        System.out.println("Gia VND sau khi doi" + vnd);
    }
}
