package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter Number of Walls");
        int numWalls = (int) input1.nextDouble();

        /*Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Number of Walls");
        int tinSize = (int) input2.nextDouble();*/

        Scanner input3 = new Scanner(System.in);
        System.out.println("What Size Tin of Paint(1 = 2.5, 2 = 5, 3 = 10)?");
        int tinSize = (int) input3.nextDouble();


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

        double totalArea = 0;
        for (int i = 0; i < numWalls; i++) {
            Scanner input4 = new Scanner(System.in);
            System.out.println("Enter Width of Wall " + i + 1 + " (Meters)");
            double width = (double) input4.nextDouble();

            Scanner input5 = new Scanner(System.in);
            System.out.println("Enter Height of wall " + i + 1 + " (Meters)");
            double height = (double) input5.nextDouble();

            double area = width * height;
            System.out.println("Area of Wall is " + area + "Meters^2");

            totalArea += area;
        }
        System.out.println("Total Area of the Walls is" + totalArea);

        int noOfTins = (int) ((Math.round(totalArea / areaPerTin)) + Math.ceil((totalArea % areaPerTin) / areaPerTin));
        System.out.println("The number of tin(s) required is " + noOfTins);
    }
}

