package org.launchcode;
import java.util.Scanner;
public class NumericType {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();

        System.out.println("Enter the width of the rectangle: ");
        double width = input.nextDouble();

        double areaOfRectangle = length * width;

        System.out.println("The area of your rectangle is: " + areaOfRectangle);

    }
}
