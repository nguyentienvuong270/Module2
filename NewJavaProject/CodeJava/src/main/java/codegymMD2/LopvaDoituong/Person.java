package codegymMD2.LopvaDoituong;

public class Person {
    String name; // Các thuộc tính (đặc điểm) mà các đối tượng có thể mang
    int age; // Có thể quy định giá trị mặc định

    // Hàm tạo: Sử dụng để tạo các đối tươngk
    // Trùng tên với class.
    // Có tể có nhiều hàm tạo nhưng bắt buộc khác nhau về tham số truyền vào.
    Person(){}

    Person(String name, int age){
        System.out.println();
        this.name = name;
        this.age = age;
    }

    void study(){
        System.out.println(this.name + " is studying");
    }

    int getYoB(){
        int year = 2001;
        return year;
    }
}
