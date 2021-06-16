package com.company;

import java.util.Scanner;

public class Main {

    public static String yesNO(int wallNum){
        Scanner input2 = new Scanner(System.in);
        System.out.println("Does Wall " + (wallNum + 1) + " Have a Void?(Yes or No)");
        String answer = input2.nextLine();
        answer = answer.toUpperCase();
        return answer;
    }

    public static double areaCalc(int wallNum, double voidArea, int numWalls){
        Scanner input3 = new Scanner(System.in);
        double[] walls = new double[numWalls];
        System.out.println("Enter Width of Wall " + (wallNum + 1) + " (m)");
        double width = input3.nextDouble();
        System.out.println("Enter Height of Wall " + (wallNum + 1) + " (m)");
        double height = input3.nextDouble();
        double area = (width * height) - voidArea;
        walls[wallNum] = area;
        System.out.println("Area of Wall is " + (walls[wallNum]) + " m^2");
        return area;
    }

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

        double totalArea = 0;
        for (int i = 0; i < numWalls; i++) {

            double voidArea = 0;
            if (yesNO(i).equals("YES")) {
                System.out.println("Enter Width of Void (m)");
                double widthWindow = input.nextDouble();
                System.out.println("Enter Height of Void (m)");
                double heightWindow = input.nextDouble();
                voidArea = heightWindow * widthWindow;
            }

            totalArea += areaCalc(i, voidArea, numWalls);
        }

        System.out.println("Total Area of the Walls is " + totalArea + "m^2");

        int noOfTins = (int) ((Math.ceil(totalArea / areaPerTin)));
        System.out.println("The number of tin(s) required is " + noOfTins);

        switch (tinSize) {
            case 1:
                System.out.println("Price = £" + (3.50 * noOfTins));
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

