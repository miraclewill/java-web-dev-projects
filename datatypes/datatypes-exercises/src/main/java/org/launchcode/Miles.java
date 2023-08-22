package org.launchcode;

import java.util.Scanner;

public class Miles {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of mile you have driven: ");
        double milesDriven = input.nextDouble();

        System.out.println("Enter the amount of gas you have consumed(in gallons): ");
        double gas = input.nextDouble();

        double milesPerGallon = milesDriven / gas;

        System.out.println("You are running on " + milesPerGallon + " mpg");

    }
}