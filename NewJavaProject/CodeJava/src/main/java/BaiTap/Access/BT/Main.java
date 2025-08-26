package BaiTap.Access.BT;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle (4.1);
        System.out.println("Id circle 1: " + circle.getId());
        System.out.println("C = " + circle.getC());
        System.out.println("S = " + circle.getS());
        System.out.println(("Max radius = " + circle.maxRadius));

        Circle circle1 = new Circle(4.3);
        System.out.println("Id circle 2: " + circle1.getId());
        System.out.println("C1 = " + circle1.getC());
        System.out.println("S1 = " + circle1.totalS );
        System.out.println(("Max radius = " + circle.maxRadius));
    }

}
