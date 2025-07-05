package BaiTap;

import java.util.Scanner;

public class BT3_7 {
    public static void main(String[] args) {
        // Nhập xuất:

        /*
        // Bài 1:
        System.out.println("Hello World");

        // Bài 2:
        System.out.println("Hello World, Hi Ae");

        // Bài 3:
        Scanner inputStr = new Scanner(System.in);
        System.out.println("Nhập tên của bạn:");
        String a = inputStr.nextLine();
        System.out.println("Tên của bạn là: " + a);
        */

        // Kiểu dữ liệu:

        /*
        // Bài 1:
        int x = 1;
        System.out.println(x);

        // Bài 2:

        Scanner inputnumber = new Scanner(System.in);
        System.out.println("Nhập vào 1 số:");
        int y = inputnumber.nextInt();
        System.out.println("y = " + y);

        // Bài 3:

        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = inputnumber.nextInt();

        System.out.print("Nhập số b: ");
        int b = inputnumber.nextInt();

        System.out.println("Số a = " + a + ", Số b = " + b);
        System.out.println("Tổng = " + (a + b));
        System.out.println("Hiệu = " + (a - b));
        System.out.println("Tích = " + (a * b));
        if (b != 0) {
            System.out.println("Thương = " + (a / b));
        } else {
            System.out.println("Không thể chia cho 0");
        }

        // Bài 4:

        Scanner inputName = new Scanner(System.in);
        Scanner inputTuoi = new Scanner(System.in);
        System.out.print("Nhập tên của bạn: ");
        String a = inputName.nextLine();
        System.out.print("Nhập tuổi của bạn: ");
        int b = inputTuoi.nextInt();
        System.out.println("Xin chào " + a + ", tôi năm nay  " + b );
        */

        // Toàn Tử:

        /*
        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = inputnumber.nextInt();

        System.out.print("Nhập số b: ");
        int b = inputnumber.nextInt();

        System.out.println("\n--- 1. Toán tử số học ---");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        if (b != 0) {
            System.out.println("a / b = " + (a / b));
            System.out.println("a % b = " + (a % b));
        } else {
            System.out.println("Không thể chia cho 0!");
        }

        System.out.println("\n--- 2. Toán tử gán ---");
        int x = a;
        System.out.println("x = " + x);
        x += b;
        System.out.println("x += b: " + x);
        x -= b;
        System.out.println("x -= b: " + x);
        x *= b;
        System.out.println("x *= b: " + x);
        if (b != 0) {
            x /= b;
            System.out.println("x /= b: " + x);
        } else {
            System.out.println("Không thể thực hiện x /= b vì b = 0");
        }

        System.out.println("\n--- 3. Toán tử tăng/giảm ---");
        int y = a;
        System.out.println("y ban đầu: " + y);
        y++;
        System.out.println("y++: " + y);
        y--;
        System.out.println("y--: " + y);

        System.out.println("\n--- 4. Toán tử so sánh ---");
        System.out.println("a < b: " + (a < b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        */


        // Điều kiện

        /*
        // Bài 1
        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Nhập số a: ");
        int a = inputnumber.nextInt();

        System.out.print("Nhập số b: ");
        int b = inputnumber.nextInt();

        if (b == 0) {
            System.out.println("Không thể chia cho 0!");
        } else if (a % b == 0) {
            System.out.println("Số a chia hết cho b. Kết quả là: " + (a / b));
        } else {
            System.out.println("Số a không chia hết cho b.");
        }

        // Bài 2:
        Scanner inputnumber = new Scanner(System.in);
        System.out.println("Nhập số tuổi của bạn: ");
        int a = inputnumber.nextInt();

        if( a <= 0 ){
            System.out.println("Tuổi bạn nhập không hợp lệ")
        }else if ( a <= 15){
            System.out.println("Bạn không đủ số tuổi để học lớp 10");
        }else {
            System.out.println("Bạn đủ số tuổi để học lớp 10");
        }

        // Bài 3:
        Scanner inputnumber = new Scanner(System.in);
        System.out.println("Nhập số tuổi của bạn: ");
        int a = inputnumber.nextInt();

        if (a > 0) {
            System.out.println("Số bạn nhập lớn hơn 0.");
        } else if (a < 0) {
            System.out.println("Số bạn nhập nhỏ hơn 0.");
        } else {
            System.out.println("Số bạn nhập là 0.");
        }

        // Bài 4:
        Scanner inputnumber = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất (a): ");
        int a = inputnumber.nextInt();

        System.out.print("Nhập số nguyên thứ hai (b): ");
        int b = inputnumber.nextInt();

        System.out.print("Nhập số nguyên thứ ba (c): ");
        int c = inputnumber.nextInt();

        int max = a;

        if (b > max) {
            max = b;
        }

        if (c > max) {
            max = c;
        }

        System.out.println("Số lớn nhất trong ba số là: " + max);
*/
        // Bài 5:
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("Nhập điểm bài kiểm tra: ");
        double diemBaiKiemTra = inputNumber.nextDouble();

        System.out.print("Nhập điểm thi giữa kỳ: ");
        double diemGiuaKy = inputNumber.nextDouble();

        System.out.print("Nhập điểm thi cuối kỳ: ");
        double diemCuoiKy = inputNumber.nextDouble();


        double diemTrungBinh = (diemBaiKiemTra + diemGiuaKy + diemCuoiKy) / 3;

        String xepLoai;
        if (diemTrungBinh >= 8.0) {
            xepLoai = "Giỏi";
        } else if (diemTrungBinh >= 6.5) {
            xepLoai = "Khá";
        } else if (diemTrungBinh >= 5.0) {
            xepLoai = "Trung bình";
        } else {
            xepLoai = "Yếu";
        }

        System.out.printf("Điểm trung bình: \n" + diemTrungBinh);
        System.out.println("\nXếp loại học lực: \n" + xepLoai);


    }
}
