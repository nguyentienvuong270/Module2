package com.codegym;


// Khai báo lớp trừu tượng
public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public final void makeSound() {
        System.out.println("U i a u i a");
    }

    public abstract void go();
    // Phương thức abstract thì không có triển khai việc triển khai sẽ phụ thuộc vào lớp con

    public abstract String eat();
}


/*
 có thể khai báo thuộc tính, phương thức và constructor như 1 lớp
 bình thuường và chứa phương thưc abstract
 */
// Không thể khởi tạo đối tượng cho abstract class


// Final đi với class thì không cho phép lớp nào kế thừa
// FInal đi với phương thức không cho ghi đè phương
// Final biến để khai báo hằng

// final và abstract không thể đứng cùng nhau