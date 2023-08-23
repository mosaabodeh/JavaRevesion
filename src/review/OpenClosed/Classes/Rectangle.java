package review.OpenClosed.Classes;

import review.OpenClosed.InterFaces.IShape;

public class Rectangle implements IShape {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Void Shape() {
        System.out.println("the area for the Rectangle Shape is : "+ (width*height));
        return null;
    }
}
