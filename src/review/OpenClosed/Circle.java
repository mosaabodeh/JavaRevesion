package review.OpenClosed;

 class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
}

public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
}

class AreaCalculator {
    public double calculateArea(Object shape) {
        if (shape instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) shape;
            return rectangle.width * rectangle.height;
        } else if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            return Math.PI * circle.radius * circle.radius;
        }
        return 0;
    }



    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        AreaCalculator calculator = new AreaCalculator();
        double rectangleArea = calculator.calculateArea(rectangle);
        System.out.println("Rectangle Area: " + rectangleArea);

        double circleArea = calculator.calculateArea(circle);
        System.out.println("Circle Area: " + circleArea);
    }
}

