package be.intecbrussel.geometry;

import javax.swing.*;

public class GraphicalApp {
    public static void main(String[] args) {
        int height = 700;
        int width = 700;
        Rectangle rectangle = new Rectangle(44,44,200,50);
        Rectangle rectangle2 = new Rectangle(200,444,100,500);
        Rectangle rectangle3 = new Rectangle(99,50,600,600);

        Drawing drawing = new Drawing();
        drawing.add(rectangle);
        drawing.add(rectangle2);
        drawing.add(rectangle3);

        GraphicalDrawingContext gui = new GraphicalDrawingContext(height,width);
        drawing.draw(gui);

        gui.draw();
    }
}
