package com.codegym;

// class NON ABSTRACT triển khai interfacr
// thì sẽ phải triển khai hết các phương thức được khai báo
public class Bird extends Animal implements Flyable, A{
    private String name;
    public Bird(String name) {
        super(name);
    }



    @Override
    public void fly() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String bay() {
        return "";
    }

    @Override
    public String haCanh(String name) {
        return "";
    }

    @Override
    public void go() {

    }

    @Override
    public String eat() {
        return "";
    }

    @Override
    public void run() {

    }
}
