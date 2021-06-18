package com.company;

public class Wall extends Shapes {
    ///////////Attribute



    ///////////Constructors
    public Wall(double Width, double Height, boolean Window){
        this.width = Width;
        this.height = Height;
        this.area = width * height;
    }

    public Wall(){
        this.width = 0;
        this.height = 0;
    }


    //////////Methods

}