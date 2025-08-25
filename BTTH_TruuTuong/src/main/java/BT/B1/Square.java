package BT.B1;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public String toString() {
        return "Hình vuông với cạnh = " + getSide();
    }

    public double getSide() {
        return super.toString().contains("chiều rộng = ") ? Double.parseDouble(
                super.toString().split("chiều rộng = ")[1].split(",")[0]
        ) : 0;
    }
}
