package com.codegym;

// Khai báo interface: là bản thiết kế, 1 nơi chứa tập các tên tính năng mà các class "Triển khai (Implement)" sử dụng
public interface Flyable {
    public abstract void fly(); // mặc định phương này sẽ có public abstract

    String bay();

    String haCanh(String name);

    void run();
}


// Interface thì hỗ trợ đa triển khai
// Thường mô tả 1 tập tính các tính năng => Mỗi quan hệ với lớp triển khai là can do
// Abstract thì mô tả thực thể trừu tượng => Mối quan hệ với lớp con là is - a