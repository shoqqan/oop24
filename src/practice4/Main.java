package src.practice4;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Shape> shapes = new Vector<>();

        Shape circle = new Circle(1, Color.RED, 5.0);
        Shape rectangle = new Rectangle(2, Color.BLUE, 10.0, 20.0);
        Shape triangle = new Triangle(3, Color.GREEN, 8.0, 12.0);

        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
