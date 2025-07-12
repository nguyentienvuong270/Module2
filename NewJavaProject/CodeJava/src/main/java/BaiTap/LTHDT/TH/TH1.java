package BaiTap.LTHDT.TH;

import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();
        System.out.print("Enter the height:");
        double height = scanner.nextDouble();
        Retangle retangle = new Retangle(width, height);
        System.out.println("Your Rectangle \n"+ retangle.display());
        System.out.println("Perimeter of the Rectangle: "+ retangle.getPerimeter());
        System.out.println("Area of the Rectangle: "+ retangle.getArea());
    }

}
