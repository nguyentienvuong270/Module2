package BaiTap.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(2.5);
        Circle c3 = new Circle(3.0, "blue");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
    }
}
