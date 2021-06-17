package com.company;

import java.util.Scanner;

public class Room {

    ///////////Attribute
    protected int numOfWalls;
    protected double totalArea;
    ///////////Constructors

    //////////Methods


    public int getNumOfWalls() {
        return numOfWalls;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setNumOfWalls(int numOfWalls) {
        this.numOfWalls = numOfWalls;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }
}