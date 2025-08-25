package org.example;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
/*
Du lieu: [2,4,5,6,3,1] input
Yeu Cau: chi chua cac phan tu chan?

B1: Khoi tao mang chua cac phan tu
B2: Chay vong lap
B3: Khiem tra tung tu chia het 2 hay khong neu co them vao mang o b1
B4: In mang moi
 */
        List<Integer> arr = new ArrayList<>();
        arr.add(2); // them
        arr.add(4);


//        System.out.println(arr.get(0)); // lay ra phan tu o vi tri tuong ung

//        System.out.println(arr.size()); // lay ra so luong phan tu
//        for (int i = 0; i < arr.size(); i++) {
//            System.out.println(arr.get(i)); //a[i]
//        }

//        for(Integer e: arr){
//            System.out.println(e);
//        }

        arr.set(1,22);// sua
        arr.remove(1); // xoa

        for(Integer e: arr){
            System.out.println(e);
        }

        // tao 1 class student ( ten tuoi
   }
}
