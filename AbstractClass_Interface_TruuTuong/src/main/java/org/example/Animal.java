package org.example;

// Khai bao lop truu tuong
public abstract class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound(){
        System.out.println("u i a");
    }

    public abstract void go();
    //phuong thuc abstract thi khong co trien khai, viec khai thi phu thuoc vao lop con
}

// co the khai bao thuoc tinh, phuong thuc va constructor nhu 1 lop binh thuong va chua cac phuong thuc abstract

// khong the khoi tao doi tuong cho abstract class

// Final di voi class thi khong cho phep lop nao ke thua
// Final di vs phuong thuc khong cho ghi de phuong thuc


