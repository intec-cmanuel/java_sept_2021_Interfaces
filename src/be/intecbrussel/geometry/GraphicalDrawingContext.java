package be.intecbrussel.geometry;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GraphicalDrawingContext implements DrawingContext {
    private JFrame frame;

    public GraphicalDrawingContext(int w, int h) {
        frame = new JFrame();
        frame.setSize(w, h);
        frame.setTitle("Testing Shapes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void draw(Rectangle rectangle) {
        GraphicalDrawable.add(rectangle);
    }

    @Override
    public void draw(Circle circle) {

    }

    @Override
    public void draw(Triangle triangle) {

    }

    public void draw(){
        GraphicalDrawable graphicalDrawable = new GraphicalDrawable();
        frame.add(graphicalDrawable);
    }
}
