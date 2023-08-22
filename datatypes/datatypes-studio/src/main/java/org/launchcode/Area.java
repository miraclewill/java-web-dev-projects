package org.launchcode;
import studios.areaofacircle.Circle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");

        double userRadius = input.nextDouble();

        while (userRadius < 0) {
            System.out.println("Please enter a positive number");
             userRadius = input.nextDouble();
        }

        double areaOfCircle = Circle.getArea(userRadius);

        System.out.println("The area of a circle of radius " + userRadius + " is: " + areaOfCircle);

        input.close();
    }
}
