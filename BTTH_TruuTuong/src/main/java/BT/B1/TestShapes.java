package BT.B1;

public class TestShapes {
    public static void main(String[] args) {
        Resizeable circle = new Circle(10);
        Resizeable rectangle = new Rectangle(4, 5);
        Resizeable square = new Square(6);

        System.out.println("Trước khi thay đổi kích thước:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);

        double percent = Math.random() * 100;
        System.out.println("\nThay đổi kích thước với " + percent + "%:\n");

        circle.resize(percent);
        rectangle.resize(percent);
        square.resize(percent);

        System.out.println("Sau khi thay đổi kích thước:");
        System.out.println(circle);
        System.out.println(rectangle);
        System.out.println(square);
    }
}
