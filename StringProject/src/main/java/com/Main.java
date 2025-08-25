package com;


public class Main {
    public static void main(String[] args) {
//        String name = "Linh"; // => 1 object chuỗi => literal
//        String name2 = new String("Linh"); // 1 object chuỗi => String object
//
//        char[] chars = {'l', 'o', 'c'};
//        String name3 = new String(chars); // 1 object chuỗi
//        // String là kiểu dữ liệu của các chuôĩ được sắp xếp có thứ tự.
//        System.out.println(name3);

//        String name = "Linh"; // Immutable
//        name.toUpperCase(); // (Tạo 1 string và gán)
//        System.out.println(name);
//
//        StringBuilder str = new StringBuilder("Lộc"); // Mutable
//        str.append("h");
//        str.reverse();
//        System.out.println(str);

        int age = 10;

        // Các giá trị của String thì nằm trong heap
        String name = "Linh"; // Với string literal thì khi lưu trữ sẽ được đẩy 1 vùng nhớ được gọi là String pool
        String name01 = "Linh"; // nhận ra là string literal vào kiểm tra xem pool có chuỗi đó hay chưa
        // nếu có rồi thì lấy luôn giá trị đó, chưa có thì khởi tạo mới.
        System.out.println(name == name01); // true

        String name02 = new String("CodeGym");
        String name03 = new String("CodeGym");
        System.out.println(name02 == name03); // false

        // Các hàm hay, xử dụng nhiều của String java.

    }
}

// Immutable: Là các class chỉ có get và k có set.
// Mutable: là các class có cả get và set

class Person { // Immutable example
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}


class Student { // Mutable example
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


// Xung đột dữ liệu (Đa luồng)