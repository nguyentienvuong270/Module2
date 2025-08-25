package com.codegym;

public abstract class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Hehe");
    }
}


class Tom extends Cat {
    public Tom(String name) {
        super(name); // gọi đến constructor của lop cha
    }

    @Override
    public void go() {
        System.out.println("Hô Hô");
    }

    @Override
    public String eat() {
        go();
        return "";
    }

    public static void main(String[] args) {
        Tom t = new Tom("Ning");
        t.eat();
    }
}

// Khi 1 class kế thừa 1 abstract class thì sẽ phải triển khai
// các abstract method của lớp cha