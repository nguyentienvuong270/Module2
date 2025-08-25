package BT.B1;

public class Rectangle implements Resizeable{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resize(double percent) {
        this.width += this.width * percent / 100;
        this.height += this.height * percent / 100;
    }

    @Override
    public String toString() {
        return "Hình chữ nhật với chiều rộng = " + width + ", chiều cao = " + height;
    }
}
