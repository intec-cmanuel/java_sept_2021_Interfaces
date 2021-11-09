package be.intecbrussel.geometry;

import java.util.Objects;

public class Rectangle extends Shape {
    private double length;
    private double width;

    private static int count;
    public static final int ANGLES = 4;

    public Rectangle() {
        this(0, 0);
    }

    public Rectangle(double length, double width) {
        this(length, width, 0, 0);
    }

    public Rectangle(double length, double width, int x, int y) {
        setLength(length);
        setWidth(width);
        setX(x);
        setY(y);
        count++;
    }

    public Rectangle(Rectangle rectangle) {
        this(rectangle.getLength(), rectangle.getWidth(), rectangle.getX(), rectangle.getY());
    }

    public void setLength(double length) {
        boolean length2IsNegative = length < 0;

        if (length2IsNegative) {
            this.length = -length;
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width2) {
        if (width2 < 0) {
            width = -width2;
        } else {
            width = width2;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getArea() {
        double area = length * width;
        return area;
    }

    @Override
    public double getPerimeter() {
        double circumference = (length * 2) + (width * 2);
        return circumference;
    }

    public void grow(int d) {
        setLength(length * d);
        setWidth(width * d);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.length, length) == 0 && Double.compare(rectangle.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), length, width);
    }

    @Override
    public void scale(int factor) {
        setLength((getLength()/100)*factor);
        setWidth((getWidth()/100)*factor);
    }

    @Override
    public void draw(DrawingContext dc) {
        dc.draw(this);
    }
}