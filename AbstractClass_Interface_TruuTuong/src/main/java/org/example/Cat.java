package org.example;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }

    @Override
    public void go() {
        System.out.println("Meo " + name + " dang di");
    }

}

class Tom extends Cat{
    public Tom(String name) {
        super(name);
    }

    @Override
    public void go() {
    }
}
