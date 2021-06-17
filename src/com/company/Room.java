package com.company;

import java.util.ArrayList;

public class Room {

    ///////////Attribute
    private int numOfWalls;
    private double totalArea;
    ArrayList<Double> wallAreas = new ArrayList<>();
    ///////////Constructors





    //////////Methods


    public double getNumOfWalls() {
        return numOfWalls;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public ArrayList<Double> getWallAreas() {
        return wallAreas;
    }

    public void setNumOfWalls(int numOfWalls) {
        this.numOfWalls = numOfWalls;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setWallAreas(ArrayList<Double> wallAreas) {
        this.wallAreas = wallAreas;
    }
}