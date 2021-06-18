package com.company;

import java.util.ArrayList;

public class Room {

    ///////////Attribute
    ArrayList<Double> wallAreas = new ArrayList<>();
    private int numOfWalls;
    private int numOfWindows;
    private Double totalArea;
    ///////////Constructors

    public Room(ArrayList<Double> wallAreas, int numOfWalls, int numOfWindows){
        this.wallAreas = wallAreas;
        this.numOfWalls = numOfWalls;
        this.numOfWindows = numOfWindows;
        totalArea(wallAreas);
    }

    public Room(){
        this.numOfWalls = 0;
        this.totalArea = 0d;
        this.numOfWindows = 0;
    }

    //////////Methods


    public int getNumOfWalls() {
        return numOfWalls;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public ArrayList<Double> getWallAreas() {
        return wallAreas;
    }

    public int getNumOfWindows() {return numOfWindows; }

    public void setNumOfWalls(int numOfWalls) {
        this.numOfWalls = numOfWalls;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public void setWallAreas(ArrayList<Double> wallAreas) {
        this.wallAreas = wallAreas;
    }

    public void setNumOfWindows(int numOfWindows) {this.numOfWindows = numOfWindows; }

    private void totalArea(ArrayList<Double> wallAreas){
        Double sum = 0d;
        for (double d: this.wallAreas){
            sum += d;
        }
        this.totalArea = sum;
    }
}