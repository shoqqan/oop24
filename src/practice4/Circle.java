package src.practice4;

public class Circle extends Shape {
    private double radius;

    public Circle(int position, Color color, double radius) {
        super(position, color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " circle at position " + position + " with radius " + radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}