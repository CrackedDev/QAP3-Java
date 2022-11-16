package com.QAP3JavaQ2;

public class Demo {

    public static void main(String[] args) {

        Shape S = new Shape("Red",true);
        Circle C = new Circle(5.0);
        Circle C1 = new Circle(5.0,"blue",true);
        Rectangle R = new Rectangle(2.0,3.0);
        Rectangle R1 = new Rectangle(2.0,3.0,"green",false);
        Square Sq = new Square(4.0);
        Square Sq1 = new Square(4.0,"yellow",true);

        System.out.println(S.toString());

        System.out.println(C.toString());
        System.out.println("The area is: " + C.getArea() + " and the Perimeter is: " + C.getPerimeter());

        System.out.println(C1.toString());
        System.out.println("The area is: " + C1.getArea() + " and the Perimeter is: " + C1.getPerimeter());

        System.out.println(R.toString());
        System.out.println("The area is: " + R.getArea() + " and the Perimeter is: " + R.getPerimeter());

        System.out.println(R1.toString());
        System.out.println("The area is: " + R1.getArea() + " and the Perimeter is: " + R1.getPerimeter());

        System.out.println(Sq.toString());
        System.out.println("The area is: " + Sq.getArea() + " and the Perimeter is: " + Sq.getPerimeter());

        System.out.println(Sq1.toString());
        System.out.println("The area is: " + Sq1.getArea() + " and the Perimeter is: " + Sq1.getPerimeter());

    }
}
