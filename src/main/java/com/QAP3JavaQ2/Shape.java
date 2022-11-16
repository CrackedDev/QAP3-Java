package com.QAP3JavaQ2;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = true;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public boolean FILLED(){
        return filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {return "A Shape with color of " + color + " and filled = " + filled;
    }
}
