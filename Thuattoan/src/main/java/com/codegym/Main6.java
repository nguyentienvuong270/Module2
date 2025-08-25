package com.codegym;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main6 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 5, 2, 4};
        Map<Integer, Integer> map = new HashMap<>();
        for(int item: arr) {
            if(map.containsKey(item)) {
                // Nếu có rồi thì tăng số lần xuất lên lên 1 đơn vị
               int count = map.get(item);
               count = count + 1;
               map.put(item, count);
            } else {
                // Nếu chưa có thì map sẽ hiểu là tìm thấy lần đầu tiên của item này
                int count = 1;
                map.put(item, count);
            }
//            map.put(item, map.getOrDefault(item, 0) + 1); // +1 cách
        }
        // In ra số lần xuất hiện
        Set<Integer> keys = map.keySet();
        for(Integer key: keys) {
            System.out.println("Số lần xuất hiện của " + key + " là: " + map.get(key));
        }


//        int x = 1;
//        int count = 0;
//        for(int item: arr) {
//            if(x == item)  {
//                count++;
//            }
//        }
//        System.out.println("Số lần xuất hiện x trong mảng: " + count);
    }
}
