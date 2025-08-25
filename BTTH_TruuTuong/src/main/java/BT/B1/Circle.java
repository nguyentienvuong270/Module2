package BT.B1;

public class Circle implements Resizeable{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double percent) {
        this.radius += this.radius * percent / 100;
    }

    @Override
    public String toString() {
        return "Hình tròn với bán kính = " + radius;
    }
}
