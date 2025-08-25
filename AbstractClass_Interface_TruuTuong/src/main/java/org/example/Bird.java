package org.example;

// class NON ABSTRACT trien khai interface thi se phai trien khai het cac phuong thuc dc khai bao
public class Bird implements Flyable{
    @Override
    public void fly() {

    }

    @Override
    public String bay() {
        return "";
    }

    @Override
    public String hacanh(String name) {
        return "";
    }
}
