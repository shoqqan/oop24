package src.practice4;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(int position, Color color, double base, double height) {
        super(position, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a " + color + " triangle at position " + position + " with base " + base + " and height " + height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}