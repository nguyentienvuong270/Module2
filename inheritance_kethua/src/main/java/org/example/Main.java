package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        Student student = new Student("Vuong", 2.1,18 );
        System.out.println(student.getName());
        student.studying();
        // Đối tượng sinh ra có thể sử dụng thuộc tính hoặc phương thức của lớp cha trong phạm vi cho phép của lớp cha (Access Modifier0
*/
//        Calculator c = new Calculator();
//        int r1 = c.getTotal();// goi den ham co tham so tuong ung
//        double r3 = c.getTotal(4.1,3.3,5.5);

//        Person p = new Person();
//        p.sing("Trinh");
//        Student s = new Student();
//        s.sing("Trinh");

        Person p = new Student();
        // kieu khai bao     kieu thuc te
        // Ham duoc goi ra luon uu tien kieu thuc te
        p.sing("trinh la gi");
    }
}