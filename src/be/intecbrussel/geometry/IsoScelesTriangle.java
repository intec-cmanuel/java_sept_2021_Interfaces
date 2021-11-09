package be.intecbrussel.geometry;

public class IsoScelesTriangle extends Triangle{
    private static int count;

    {
        count++;
    }

    public IsoScelesTriangle() {
        super();
    }

    public IsoScelesTriangle(int height, int width, int perpendicular) {
        super(height, width, perpendicular);
    }

    public IsoScelesTriangle(int height, int width, int perpendicular, int x, int y) {
        super(height, width, perpendicular, x, y);
    }

    public IsoScelesTriangle(Triangle triangle) {
        super(triangle);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setPerpendicular(width/2);
    }

    @Override
    public void setPerpendicular(int perpendicular) {
        super.setPerpendicular(perpendicular);
        super.setWidth(perpendicular*2);
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return "IsoScelesTriangle{} " + super.toString();
    }
}
