package ITJ.TH;

import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter width: ");
        float width = inputNumber.nextFloat();

        System.out.println("Enter height: ");
        float height = inputNumber.nextFloat();

        System.out.println("Enter height: ");
        float area = width*height;

        System.out.println("Area is: " + area);




    }
}
