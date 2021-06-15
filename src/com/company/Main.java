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

            System.out.println("Does Walls " + (i + 1) + " Have a Window?(true or false)");
            boolean answer = input.nextBoolean();

            double windowArea = 0;
            if (answer == true) {
                System.out.println("Enter Width of Window (m)");
                double widthWindow = (double) input.nextDouble();
                System.out.println("Enter Height of Window (m)");
                double heightWindow = (double) input.nextDouble();
                windowArea = heightWindow * widthWindow;
            }

            System.out.println("Enter Width of Wall " + (i + 1) + " (m)");
            double width = (double) input.nextDouble();


            System.out.println("Enter Height of Wall " + (i + 1) + " (m)");
            double height = (double) input.nextDouble();

            double area = (width * height) - windowArea;
            System.out.println("Area of Wall is " + area + " m^2");

            walls[i] = area;
            totalArea += area;
        }

        System.out.println("Total Area of the Walls is " + totalArea + "m^2");

        int noOfTins = (int) ((Math.round(totalArea / areaPerTin)) + Math.ceil((totalArea % areaPerTin) / areaPerTin));
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
        /*int i = 0;
        while (i < 6){
            System.out.println(i);
            i++;
        }
        */
    }
}

