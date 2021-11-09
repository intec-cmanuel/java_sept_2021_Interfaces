package be.intecbrussel.geometry;

public interface Scalable {
    public static final int QUARTER = 25;
    public static final int HALF = 50;
    public static final int DOUBLE = 200;

    public abstract void scale(int factor);

    public default void scaleDouble(){
        scale(DOUBLE);
        System.out.println("Hello world");
    }


    public default void scaleHalf() {
        scale(HALF);
    }

    public default void scaleQuarter() {
        scale(QUARTER);
    }

    public static void helloWorld(){
        System.out.println("Hello world!");
    }
}
