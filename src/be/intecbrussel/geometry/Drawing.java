package be.intecbrussel.geometry;

import java.util.Arrays;
import java.util.Objects;

public class Drawing {
    private Shape[] shapes;
    private int size;

    public Drawing() {
        shapes = new Shape[100];
        size = 0;
    }

    public void add(Shape shape) {
        int index = findElementIndex(null);
        if (findElementIndex(shape) != -1) {
            return;
        }

        if (index == -1) {
            Shape[] biggerShapeArray = new Shape[shapes.length+1];
            System.arraycopy(shapes, 0, biggerShapeArray, 0, shapes.length);
            shapes = biggerShapeArray;
            index = shapes.length-1;
        }

        shapes[index] = shape;
        size++;
    }

    public void remove(Shape shape) {
        int index = findElementIndex(shape);
        if (index == -1) {
            return;
        }

        shapes[index] = null;
        size--;
    }

    private int findElementIndex(Shape shape) {
        for (int i = 0; i < shapes.length; i++) {
            // without Object.equals() =>  if (shapes[i] == shape || (shapes[i] != null && shapes[i].equals(shape))
            if (Objects.equals(shapes[i], shape)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(shapes, null);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Drawing{" +
                "shapes=" + Arrays.toString(shapes) +
                ", size=" + size +
                '}';
    }
}
