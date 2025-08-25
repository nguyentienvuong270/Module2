package hinh;

public class Main {
    public static void main(String[] args) {
        Shape c1 = new Circle(4.0);
        Shape r1 = new Rectangle(4.0, 10.0);
        Shape c2 = new Circle(5.0);
        Shape r2 = new Rectangle(5.0, 20.0);
        Shape[] arr = {c1, r1, c2, r2};
        System.out.println("Các hình trước thay đổi");
        for(Shape item: arr) {
            System.out.println(item.toString());
        }

        double percent = Math.random() * 100 + 1; // 1 - 100
        System.out.println("Các hình sau thay đổi");
        for(Shape item: arr) {
            item.resize(percent);
            System.out.println(item);
        }
    }
}
