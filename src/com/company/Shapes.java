package com.company;

public abstract class Shapes {

    ///////////Attribute
    protected double width;
    protected double height;
    protected double area;
    ///////////Constructors



    //////////Methods
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return area;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
