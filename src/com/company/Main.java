package com.company;

import java.util.Scanner;

public class Main {

    public static String yesNoWindow(int wallNum) {
        Scanner input = new Scanner(System.in);
        System.out.println("Does Wall " + (wallNum + 1) + " Have a Window?(Yes or No)");
        String answer = input.nextLine();
        answer = answer.toUpperCase();
        return answer;
    }

    public static double areaCalc(int wallNum, double windowArea) {
        Wall wall1 = new Wall();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width of Wall " + (wallNum + 1) + " (m)");
        wall1.setWidth(input.nextDouble());
        System.out.println("Enter Height of Wall " + (wallNum + 1) + " (m)");
        wall1.setHeight(input.nextDouble());
        wall1.setArea(wall1.getWidth() * wall1.getHeight());
        double paintArea = wall1.getArea() - windowArea;
        System.out.println("Area of Wall is " + (paintArea) + " m^2");
        return paintArea;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of Walls");
        Room room1 = new Room();
        room1.setNumOfWalls(input.nextInt());

        for (int i = 0; i < room1.getNumOfWalls(); i++) {

            Window window1 = new Window();
            if (yesNoWindow(i).equals("YES")) {
                System.out.println("Enter Width of Window (m)");
                window1.setWidth(input.nextDouble());
                System.out.println("Enter Height of Window (m)");
                window1.setHeight(input.nextDouble());
                window1.setArea(window1.getWidth() * window1.getHeight());
                room1.setNumOfWindows(room1.getNumOfWalls() + 1);
                System.out.println("Total Area of the Window is " + window1.getArea() + "m^2");
            }

            double areaWall = areaCalc(i, window1.getArea());
            room1.setTotalArea(room1.getTotalArea() + areaWall);
            room1.wallAreas.add(areaWall);
        }
        System.out.println("Total Area of the Walls is " + room1.getTotalArea() + "m^2");
        System.out.println("Area of Walls in the Room (m^2) = " + (room1.getWallAreas()));
//        System.out.println("Number of Windows in Room = " + room1.getNumOfWindows());


        System.out.println("What Size Tin of Paint?");
        System.out.println("(1 = 2.5l, 2 = 5l, 3 = 10l)");
        int tinSize = input.nextInt();

        switch (tinSize) {
            case 1 -> {
                Tin25 tin1 = new Tin25();
                int noOfTins = (int) ((Math.ceil(room1.getTotalArea() / tin1.getAreaPerTin())));
                System.out.println("The number of tin(s) required is " + noOfTins);
                System.out.println("Price = £" + (tin1.getPrice() * noOfTins));
            }
            case 2 -> {
                Tin5 tin2 = new Tin5();
                int noOfTins = (int) ((Math.ceil(room1.getTotalArea() / tin2.getAreaPerTin())));
                System.out.println("The number of tin(s) required is " + noOfTins);
                System.out.println("Price = £" + (tin2.getPrice() * noOfTins));
            }
            case 3 -> {
                Tin10 tin3 = new Tin10();
                int noOfTins = (int) ((Math.ceil(room1.getTotalArea() / tin3.getAreaPerTin())));
                System.out.println("The number of tin(s) required is " + noOfTins);
                System.out.println("Price = £" + (tin3.getPrice() * noOfTins));
            }
        }
    }
}