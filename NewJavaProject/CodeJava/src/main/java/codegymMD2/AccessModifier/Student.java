package codegymMD2.AccessModifier;

// public: là 1 access modifier cho phép sử dụng ở 1 phạm vi toàn bộ chương trình
// private: phạm vi trong cùng 1 class
// default: (khi không có từ khóa nào phía trước) phạm vi trong cùng 1 package.
// protected: trong mối quan hệ kế thừa (Kể cả khác package)
// static là từ khóa khai báo dữ liệu (thuộc tính hoặc phương thức) cho class.

public class Student { // export class.

    public String name;
    public int age;
    private  int cccd = 12331;
    double height = 15;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void go(){
        System.out.println(this.name + "is going");
        System.out.println(this.cccd);

    }

    private void show(){
        System.out.println("Hello");
    }

}
