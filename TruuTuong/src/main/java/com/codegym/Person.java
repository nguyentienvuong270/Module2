package com.codegym;

public class Person {
    String name;
    int age;

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, int age) {
        this(name); // gọi đến constructor có tham số tương ứng ở lớp này.
        this.age = age;
    }

    public String getName() {
        return this.name; // đại diện cho tôi tượng đang chỉ định đến hàm nay
    }


    public static void main(String[] args) {
        Person p = new Person("NIng");
        System.out.println(p.getName());
    }
}

