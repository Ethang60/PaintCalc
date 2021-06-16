package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Walls");
        int numWalls = (int) input.nextDouble();


        System.out.println("What Size Tin of Paint?");
        System.out.println("(1 = 2.5l, 2 = 5l, 3 = 10l)");
        int tinSize = input.nextInt();


        int areaPerTin = 0;
        switch (tinSize) {
            case 1:
                areaPerTin = 5;
                break;
            case 2:
                areaPerTin = 10;
                break;
            case 3:
                areaPerTin = 20;
        }

        double[] walls = new double[numWalls];
        double totalArea = 0;
        for (int i = 0; i < numWalls; i++) {

            System.out.println("Does Wall " + (i + 1) + " Have a Void?(Yes or No)");
            String answer = input.nextLine();
            answer = answer.toUpperCase();

            double voidArea = 0;
            if (answer.equals("YES")) {
                System.out.println("Enter Width of Void (m)");
                double widthWindow = (double) input.nextDouble();
                System.out.println("Enter Height of Void (m)");
                double heightWindow = (double) input.nextDouble();
                voidArea = heightWindow * widthWindow;
            }

            System.out.println("Enter Width of Wall " + (i + 1) + " (m)");
            double width = input.nextDouble();


            System.out.println("Enter Height of Wall " + (i + 1) + " (m)");
            double height = input.nextDouble();

            double area = (width * height) - voidArea;
            walls[i] = area;
            System.out.println("Area of Wall is " + (walls[i]) + " m^2");
            totalArea += area;
        }

        System.out.println("Total Area of the Walls is " + totalArea + "m^2");

        int noOfTins = (int) ((Math.ceil(totalArea / areaPerTin)));
        System.out.println("The number of tin(s) required is " + noOfTins);

        switch (tinSize) {
            case 1:
                System.out.println("Price = £" + (3.5 * noOfTins));
                break;
            case 2:
                System.out.println("Price = £" + (6 * noOfTins));
                break;
            case 3:
                System.out.println("Price = £" + (10 * noOfTins));
                break;

        }
    }
}

