package BaiTap.Circle;

public class Cylinder extends Circle {
    private double height;

    // Constructors
    public Cylinder() {
        super(); // call Circle()
        this.height = 1.0;
    }

    public Cylinder(double radius, double height) {
        super(radius); // call Circle(radius)
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color); // call Circle(radius, color)
        this.height = height;
    }

    // Getter and Setter
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Volume method
    public double getVolume() {
        return getArea() * height;
    }

    // Override toString
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() + ", color=" + getColor()
                + ", height=" + height + ", volume=" + getVolume() + "]";
    }
}
