package day35_Encapsulation;

public class Circle {
    private double radius;
    public static double pi;
    public double calcArea;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            return;
        }
        this.radius = radius;
    }
    static {
        pi = 3.14;
    }
    public double getCalcArea = pi* radius*radius;

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", calcArea=" + calcArea +
                ", getCalcArea=" + getCalcArea +
                '}';
    }
}

    /*
    Create a class named Circle

        privtae variables:
        radius

public variable:
        pi

        Encapsulate all the private fields

        1. radius of the circle can not be zero or negative

        Add a constructor that can set the raidus of coircle when circle object is created

        Methods:
        calcArea()
        calcPerimeter()
        toString
        */