package codegymMD2.Mang;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class Array {

    public static int getValue(){
        return 1;
    }

    public static void showName(String name){
        System.out.println("Name is " + name);
//        return; // Optional
    }

    public static void main(String[] args) {
        int value = getValue();
        System.out.println(value);
        String name = "Kai";
        showName(name);








        //<data_type>[] = {a, b, c}
//        int[] arr = {1, 3, 5, 8};
        // index     0  1  2  3
//        System.out.println(arr[2]);

//        arr[2] = 10;
//        System.out.println(arr[2]);

//        double[] arr02 = new double [3];
//         Khởi tạo như này thì mảng sẽ có giá trị theo kiểu dữ liệu tương ứng:
//         int -> 0, double -> 0.0, bolean -> false, String -> null.
//        System.out.println("Mảng với các giá trị mặc định");
//        System.out.println(Arrays.toString(arr02));
//
//        String[] arr03 = new String[5];
//        System.out.println(Arrays.toString(arr03));
//
//        boolean[] arr04 = new boolean[4];
//        System.out.println(Arrays.toString(arr04));

        // Duyệt mảng (2 cách):
//        int[] arr = {1, 3, 5, 8};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Phần tử thứ " + i + " là: "+ arr[i]);
//        }

//        for(int item: arr){
//            System.out.println(item);
//        }



    }
}
