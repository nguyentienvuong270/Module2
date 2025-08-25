package org.example;

// Khai bao interface: la ban thiet ke, 1 noi chua tep cac ten tinh nang va cac class" Trien khai (Implement)" Su dung

public interface Flyable {
    public abstract void fly(); // mac dinh phuong thuc nay se co public abstract

    String bay();

    String hacanh(String name);


    // Interface ho tro da trien khai
    // Mo ta 1 tap cac tinh nang
    // Abstract thi mo ta lop truu tuong => moi quan he vs lop con

}
