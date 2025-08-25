package com.codegym;

public class Main {

    public static void main(String[] args) {
//        Cat c = new Cat("Meo");
//        c.go();

        Animal b = new Bird("Vẹt");
        b = new Dog("Cún");
//        b.getName();
//
//        Bird b2 = new Bird("Cú");
//        b2.getName();
//        int a = 10;
//        b.bay();
//        byte c = 127;
//        Long d = 129l;
//        long e = 1;
//
//        int[] f = {1, 2, 4};
//        int[] g = new int[10];
//        // [0, 0 , 0 ...]
//        int[][] i = new int[10][10];
        /*
        [
            [0, 0, 0, 0, 0...],
            [0, 0, 0, 0, 0...],
            ...
        ]
         */
    }
}

class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void go() {

    }

    @Override
    public String eat() {
        return "";
    }
}
