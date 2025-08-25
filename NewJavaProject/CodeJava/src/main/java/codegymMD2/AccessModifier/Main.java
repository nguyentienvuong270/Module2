package codegymMD2.AccessModifier;

public class Main {
    public static void main(String[] args) {
        /*
        STD student = new STD("Kai", 8.4, 25);
        System.out.println(student.getName());
        student.studying();
        // Đối tượng sinh ra có thể sủ dụng thuộc tính hoặc phương thức trong phạm vi cho phép của lớp cha.( Access Modifier)
        */

        Calculator c = new Calculator();
        int r1 = c.getTotal(); // gọi đến hàm có tham số tương ứng.
        double r3 = c.getTotal(4.1,5,6.2);


        // Đa hình: cơ chế cho phép 1 đối tượng thực hiện 1 công việc theo nhiều cách khác nhau.
        // Ghi đè và nạp chồng phương thức.


    }
}
