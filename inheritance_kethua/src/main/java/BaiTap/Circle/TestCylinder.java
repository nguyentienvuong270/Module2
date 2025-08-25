package BaiTap.Circle;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(2.0, 5.0);
        Cylinder cy3 = new Cylinder(3.0, "green", 10.0);

        System.out.println(cy1);
        System.out.println(cy2);
        System.out.println(cy3);
    }
}
