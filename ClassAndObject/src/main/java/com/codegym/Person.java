package com.codegym;

// trong 1 file chỉ có 1 class public
public class Person { // tên class để public thì phải trùng tên file
    String name; // Các thuộc tính (đặc điểm) mà các đối tượng có thể mang
    int age = 44; // Có thể quy đinh gía trị mặc định
    // Các thuộc tính thì luôn có giấ trị mặc định int -> 0, String -> null, boolean -> false

    // Hàm tạo: sử dụng để tạo các đối tượng
    // Trùng tên với class
    // Có thể có nhiều hàm tạo nhưng bắt buộc khác nhau về tham số truyền vào
    // Nếu không có constructor nào được khai báo thì mặc định sẽ có 1 constructor rỗng
    Person() {
    }


    double method(int x) {
        if (x > 5) {
            return 3;
        }
        return 1;
    }

    Person(String name, int age) {

//        this.name = name; // this sẽ đại diện cho đối tượng được sinh ra
        this(name);// gọi đến constructor có tham số tương ứng
        this.age = age;
    }

    Person(String name) {
        this.name = name;
    }

    void study() {
        System.out.println(this.name + " is studying");
        // this ở đây đại diện cho đối tượng đang gọi hàm
    }


    void study(String name) {
        System.out.println(this.name + " is studying");
        this.getYearOfBirth();
        // this ở đây đại diện cho đối tượng đang gọi hàm
    }

    int getYearOfBirth() {
        // Logic
        int year = 1993;
        String name = "test";
        System.out.println(this.name);
        return year;
    }
}