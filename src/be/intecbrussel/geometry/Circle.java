package be.intecbrussel.geometry;

public class Circle extends Shape {
    public static final int ANGLES = 0;
    private static int count;
    private int radius;

    {
        count++;
    }

    public Circle() {
        this(1);
    }

    public Circle(int radius) {
        this(radius, 0, 0);
    }

    public Circle(int radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(Circle circle) {
        this(circle.getRadius(), circle.getX(), circle.getY());
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    public void grow(int d) {
        setRadius(radius * d);
    }

    public static int getCount() {
        return count;
    }


    @Override
    public void scale(int factor) {
        setRadius((getRadius()/100)*factor);
    }
}
