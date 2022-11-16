package com.QAP3JavaQ2;

public class Circle extends Shape{
    private double radius;

    public Circle (){
        this.radius = 1.0;
    }

    public Circle (double radius){
        this.radius = radius;
    }

    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public boolean FILLED() {
        return super.FILLED();
    }


    public double getArea(){
        double area = Math.PI*radius*radius;
        return area;
    }

    public double getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        return perimeter;
    }


    public String toString() {return "A Circle with radius = " + radius +", which is a subclass of " + super.toString();
    }

}
