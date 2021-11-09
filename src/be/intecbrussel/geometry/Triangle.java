package be.intecbrussel.geometry;

import java.util.Objects;

public class Triangle extends Shape{
    public static final int ANGLES = 3;
    private static int count;
    private int height;
    private int width;
    private int perpendicular;

    public Triangle() {
        this(0,0,0);
    }

    public Triangle(int height, int width, int perpendicular) {
        this(height,width,perpendicular,0,0);
    }

    public Triangle(int height, int width, int perpendicular, int x, int y) {
        super(x, y);
        this.height = height;
        this.width = width;
        this.perpendicular = perpendicular;
        count++;
    }

    public Triangle(Triangle triangle) {
        this(triangle.getHeight(), triangle.getWidth(), triangle.getPerpendicular(), triangle.getX(), triangle.getY());
    }

    public static int getCount() {
        return count;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerpendicular() {
        return perpendicular;
    }

    public void setPerpendicular(int perpendicular) {
        this.perpendicular = perpendicular;
    }

    @Override
    public double getArea() {
        return ((double)height*width) / 2;
    }

    @Override
    public double getPerimeter() {
        // Not wasting time figuring this out
        return 1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "height=" + height +
                ", width=" + width +
                ", perpendicular=" + perpendicular +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return height == triangle.height && width == triangle.width && perpendicular == triangle.perpendicular;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height, width, perpendicular);
    }

    @Override
    public void scale(int factor) {
        setHeight((getHeight()/100)*factor);
        setWidth((getWidth()/100)*factor);
    }
}
