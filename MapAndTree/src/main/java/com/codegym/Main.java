package com.codegym;

import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Linh"); // thêm dữ liệu map
        map.put(2, "Phú");
        map.put(4, "Lâm");

        // System.out.println(map.get(4)); // get ra value
        Set<Integer> keys = map.keySet(); // tương tự arraylist nhưng các giá trị bên trong là duy nhất
        // [1, 2, 4]
        // map.remove(1);
        map.put(1, "Vũ Linh");
        // hàm put sẽ thêm giá trị mới nếu key chưa tồn tại trong map, tồn tại rồi thì thay thành value mới
        for (Integer k : keys) { // 1 2 4
            System.out.println(map.get(k)); // Linh Phú Lâm
        }
        System.out.println(map.containsKey(45)); // kiểm tra xem key có tồn tại hay không
//        System.out.println(map.values());
        System.out.println("Values: ");
        for(String v: map.values()) {
            System.out.println(v);
        }

    }
}