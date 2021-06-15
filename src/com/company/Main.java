package com.company;

import java.util.Scanner;

public class Main {
    public static void main (String[]args){

    Scanner input1 = new Scanner(System.in);
    System.out.println("Enter Number of Walls");
    int numWalls = (int) input1.nextDouble();

        double totalArea = 0;

    for (int i=0; i < numWalls; i++) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter Width of Wall " + i+1 + " (Meters)");
        double width = (double) input2.nextDouble();

        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter Height of wall " + i+1 + " (Meters)");
        double height = (double) input3.nextDouble();

        double area = width * height;
        System.out.println("Area of Wall is " + area + "Meters^2");

        totalArea += area;
    }

        Scanner input4 = new Scanner(System.in);
        System.out.println("Enter Area Per Tin");
        double areaPerTin = (double) input4.nextDouble();

        int noOfTins = (int) ((Math.round(totalArea / areaPerTin)) + Math.ceil((totalArea % areaPerTin) / areaPerTin));
        System.out.println("The number of tin(s) required is " + noOfTins);
    }
}

