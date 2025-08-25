package BaiTap.Point;

public class TestPoint {
    public static void main(String[] args) {
        Point2D p2d = new Point2D(3.5f, 7.2f);
        System.out.println("Point2D: " + p2d);

        Point3D p3d = new Point3D(1.0f, 2.0f, 3.0f);
        System.out.println("Point3D: " + p3d);

        p3d.setXYZ(9.0f, 8.0f, 7.0f);
        System.out.println("After setXYZ: " + p3d);
    }
}
