package codegymMD2;

import java.util.Scanner;

public class CauDK {
    public static void main(String[] args) {
        // Cấu trúc điều kiện: Chuỗi câu ệnh cho phép chương trình quyết định thực hiện đoạn mã
      /*
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Nhập tuổi của bạn:");
        int age = inputNumber.nextInt();

        if( age >= 18 ){ // Điều kiện Java bắt buộc phải là boolean.
            System.out.println("Bạn đã đủ tuổi");
        }else {
            System.out.println("Bạn không có tuổi");
        }

        if (age > 0 && age <= 10){
            System.out.println("Thiếu nhi");
        }else if( age > 10 && age <= 18 ){
            System.out.println("Thiếu niên");
        }else if( age > 18){
            System.out.println("Thanh niên");
        }
       */

        /*
        Cấu trúc lặp: for While do....While


        for(int i = 0; i < 10; i++){
            System.out.println("I = " + i);
        }
        */

//        while (true) {
//            Scanner inputNumber = new Scanner(System.in);
//            System.out.println("Nhập vào 1 số:");
//            int a = inputNumber.nextInt();
//            if (a == 0) break;
//        }

//        Scanner inputNumber = new Scanner(System.in);
//        System.out.println("Nhập vào 1 số:");
//        int a = inputNumber.nextInt();
//        for (int i = a; i < 10; i++) {
//            System.out.println("I = " +i);
//            if (i == 0) break;
//        }
        Scanner inputNumber = new Scanner(System.in);
        do{

            System.out.println("Nhập vào 1 số:");
            int a = inputNumber.nextInt();
            System.out.println("Số vừa nhập là: " + a);
            if(a == 0) break;
        }while (true);
    }
}
