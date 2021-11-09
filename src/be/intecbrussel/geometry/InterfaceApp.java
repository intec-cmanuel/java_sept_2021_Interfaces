package be.intecbrussel.geometry;

public class InterfaceApp {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(10, 15);
        Shape rectangle2 = new Rectangle(10, 15);
        Scalable rectangle3 = new Rectangle(10, 15);

        System.out.println(rectangle3);
        rectangle3.scale(Scalable.QUARTER);
        System.out.println(rectangle3);
        rectangle3.scaleDouble();
        rectangle3.scaleDouble();
        rectangle3.scaleDouble();
        rectangle3.scaleDouble();
        System.out.println(rectangle3);
        Scalable.helloWorld();
    }
}
