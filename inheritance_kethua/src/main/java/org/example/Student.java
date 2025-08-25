package org.example;

//public class Student extends Person { // Mối quan hệ kế thừa thông qua từ khóa extends
//    // Có thể thêm thuộc tính và phương thức mới ở lớp con.
//
//    private double score;
//    private int age;
//    private String name;
//
//    // lớp con luôn phải có 1 constructer gọi đến constructer của cha
//    public Student(String name, double score, int age){
//        super(name); // gọi đến constructor có tham số tương ứng của lớp cha.
//        // tương tự với this(): gọi đến constructer cos tham số tương ứng ở chính lớp này.
//        // Có thể không có this() hoặc super(), nếu có thì chỉ sử dụng được 1 trong 2
//        this.score = score;
//        this.age   = age;
//
//    }
//
//    public Student(String name){
//        this.name = name;
//        // Đại diện cho đối tượng đang sử dụng, chỉ đến các thành phần ở chính lớp này
//
//    }
//
//    public void studying(){
//        System.out.println(super.getName() + "is studying");
//        // super trong phương thức tương tự từ khóa this( đại điện cho đối tượng đang sử dụng) nhưng sẽ truy cập đến thành phần của lớp cha.
//
//    }
//
//    public String getName(){
//        return "";
//    }
//}

/*
Ghi de: xay ra moi quan he ke thua, la cac phuong thuc cung ten cung tham so, cung kieu du lieu tra ve, khac logic xu ly ben trong
=> Dung de nang cap tinh nang.
 */

public class Student extends Person {
    public void sing(String songName){
        System.out.println("Hoc sinh hat " + songName);
    }
}