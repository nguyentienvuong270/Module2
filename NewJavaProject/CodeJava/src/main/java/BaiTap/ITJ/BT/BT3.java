package ITJ.BT;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);


        System.out.print("Nhập một số nguyên từ 0 đến 999: ");
        int number = inputNumber.nextInt();


        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
        } else {

            String ketQua = docSo(number);
            System.out.println("Cách đọc: " + ketQua);
        }
    }

    public static String docSo(int number) {
        if (number < 10) {
            return docMotChuSo(number);
        } else if (number < 20) {
            return docTu10Den19(number);
        } else if (number < 100) {
            return docHaiChuSoLonHon20(number);
        } else {
            return docBaChuSo(number);
        }
    }

    public static String docMotChuSo(int number) {
        switch (number) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String docTu10Den19(int number) {
        switch (number) {
            case 10:
                return "ten";
            case 11:
                return "eleven";
            case 12:
                return "twelve";
            case 13:
                return "thirteen";
            case 14:
                return "fourteen";
            case 15:
                return "fifteen";
            case 16:
                return "sixteen";
            case 17:
                return "seventeen";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String docHaiChuSoLonHon20(int number) {
        int chuc = number / 10;
        int donVi = number % 10;

        String ketQua = "";

        switch (chuc) {
            case 2:
                ketQua = "twenty";
                break;
            case 3:
                ketQua = "thirty";
                break;
            case 4:
                ketQua = "forty";
                break;
            case 5:
                ketQua = "fifty";
                break;
            case 6:
                ketQua = "sixty";
                break;
            case 7:
                ketQua = "seventy";
                break;
            case 8:
                ketQua = "eighty";
                break;
            case 9:
                ketQua = "ninety";
                break;
        }

        if (donVi != 0) {
            ketQua += " " + docMotChuSo(donVi);
        }

        return ketQua;
    }

    public static String docBaChuSo(int number) {
        int tram = number / 100;
        int phanDu = number % 100;

        String ketQua = docMotChuSo(tram) + " hundred";

        if (phanDu != 0) {
            ketQua += " and " + docSo(phanDu);
        }

        return ketQua;
    }
}

