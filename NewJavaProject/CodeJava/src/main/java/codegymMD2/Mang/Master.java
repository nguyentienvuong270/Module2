package codegymMD2.Mang;

import java.beans.beancontext.BeanContextChild;
import java.util.Arrays;

public class Master {
    // Thực hiện viết các hàm để thêm, sửa, xóa, chèn phần tử vào 1 mảng cho trc:
    // Làm menu bằng terminal cho người dùng thao tác

    public static void main(String[] args) {

        int length = 10;
        int size = 0; // Số lượng phần tử thực sự có trong mảng.
        int[] mArr = new int[length];

        size = addElement(mArr, size, 50);
        size = addElement(mArr, size, 4);
        size = addElement(mArr, size, 17);
        size = addElement(mArr, size, 24);
        size = addElement(mArr, size, -2);
        size = addElement(mArr, size, -17);
        size = addElement(mArr, size, 2);
        System.out.println("Mảng sau khi thêm");
        System.out.println(Arrays.toString(mArr));

        size = removeElement(mArr, size, 4);
        System.out.println("Mảng sau khi xóa");
        System.out.println(Arrays.toString(mArr));

        updateElement(mArr, size, 2, 25);
        System.out.println("Mảng sau khi sửa");
        System.out.println(Arrays.toString(mArr));

        size = insertElement(mArr, size, 3, 100);
        System.out.println("Mảng sau khi chèn 100 vào vị trí 3:");
        System.out.println(Arrays.toString(mArr));

    }

//    public static void show(int[] arr, int size){
//        for (int i = 0; i < size; i++) {
//            System.out.print(arr[i] + ",");
//        }
//    }

    public static int addElement(int[] arr, int size, int newElement) {
        arr[size] = newElement;
        size++;
        return size;
    }

    public static int removeElement(int[] arr, int size, int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index không hợp lệ");
            return size;
        }
        for (int i = index; i < size -1 ; i++) {
            arr[i] = arr[i+1];
        }
        arr[size-1] =0;
        size-- ;
        return size;
    }

    public static void updateElement(int[] arr, int size, int index, int newValue){
        if(index < 0 || index >= size){
            System.out.println("Index không hợp lệ");
        }
        arr[index] = newValue;

    }

    public static int insertElement(int[] arr, int size, int index, int newValue) {
        if (size >= arr.length) {
            System.out.println("Mảng đã đầy, không thể chèn.");
            return size;
        }
        if (index < 0 || index > size) {
            System.out.println("Index không hợp lệ");
            return size;
        }
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = newValue;
        size++;
        return size;
    }

}
