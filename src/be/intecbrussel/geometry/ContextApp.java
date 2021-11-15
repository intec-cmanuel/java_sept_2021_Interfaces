package be.intecbrussel.geometry;

public class ContextApp {
    public static void main(String[] args) {

        Drawing myLittlePicasso = new Drawing();
        Rectangle rectangle = new Rectangle(10,11);
        Triangle triangle = new Triangle(11,5,7);
        Circle circle = new Circle(11);

        myLittlePicasso.add(rectangle);
//        myLittlePicasso.add(triangle);
//        myLittlePicasso.add(circle);

        DrawingContext drawingContext = new GraphicalDrawingContext(800,800);

        myLittlePicasso.draw(drawingContext);
        myLittlePicasso.scale(Scalable.DOUBLE);
        myLittlePicasso.draw(drawingContext);

        System.out.println(myLittlePicasso);

    }
}
