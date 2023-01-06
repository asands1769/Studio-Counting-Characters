package org.launchcode.java.studios.areaofcircle;

import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            while(radius < 0){
                System.out.println("Please enter a positive number for the radius");
                radius = input.nextDouble();
            }
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle of radius " + radius + " is: " + area);
                input.close();
        }
        else {
            System.out.println("Invalid radius entered.  Goodbye");
            input.close();
        }
    }
}
