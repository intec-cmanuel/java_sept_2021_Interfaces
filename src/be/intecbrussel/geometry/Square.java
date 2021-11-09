package be.intecbrussel.geometry;

public class Square extends Rectangle {
//    public final String DESCRIPTION = "Square";
    private static int count;

    {
        count++;
    }

    public Square() {
        this(1);
    }

    public Square(double side) {
        this(side, 0, 0);
    }

    public Square(double side, int x, int y) {
        super(side, side, x, y);
    }

    public Square(Square square) {
        super(square);
    }

    @Override
    public void setLength(double length){
        setSide(length);
    }

    @Override
    public void setWidth(double width){
        setSide(width);
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    public double getSide() {
        return getLength();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "Square{} " + super.toString();
    }


}
