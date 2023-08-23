package review.OpenClosed.Classes;

import review.OpenClosed.InterFaces.IShape;

import static java.lang.Math.pow;

public class Circel implements IShape {
    public double radius;
    public Circel(double radius) {
        this.radius = radius;
    }


    @Override
    public Void Shape() {
        System.out.println("this is circle shape area is : " +Math.PI * radius * radius);
        return null;
    }
}
