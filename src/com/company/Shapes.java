package com.company;

public abstract class Shapes {

    ///////////Attribute
    private double width;
    private double height;
    private double area = height * width;
    ///////////Constructors



    //////////Methods
    protected double getWidth() {
        return width;
    }

    protected double getHeight() {
        return height;
    }

    protected double getArea() {
        return area;
    }

    protected void setWidth(double width) {
        this.width = width;
    }

    protected void setHeight(double height) {
        this.height = height;
    }

    protected void setArea(double area) {
        this.area = area;
    }
}
