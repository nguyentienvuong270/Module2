package BaiTap.Access.BT;

public class Circle {
    private int id;
    private double radius;
    public final double PI = 3.14;
    private static int coutCircleObject = 1;
    public static double maxRadius = 0;
    public static double totalS = 0;

    public Circle(double radius){
        this.id = coutCircleObject;
        this.radius = radius;
        coutCircleObject++;

        if(radius > maxRadius){
            maxRadius = radius;
        }

        double s = getS();
        totalS += s;
    }

    public double getC(){
        return 2*PI*this.radius;
    }

    public double getS(){
        return PI*Math.pow(this.radius,2);
    }

    public int getId(){
        return this.id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

}
