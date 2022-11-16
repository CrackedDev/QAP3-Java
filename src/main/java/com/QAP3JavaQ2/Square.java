package com.QAP3JavaQ2;

public class Square extends Rectangle{

    public Square(){}

    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){}
    @Override
    public void setLength(double length) {
        super.setWidth(length);
        super.setLength(length);
    }

    @Override
    public void setWidth(double width) {
        setLength(width);
    }

    @Override
    public String toString() {
        return "A Square with side= " + getWidth() + ", which is a subclass of " + super.toString();
    }
}