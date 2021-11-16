package be.intecbrussel.geometry;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

public class Drawing  implements Drawable, Iterable<Drawable>{
    private Drawable[] drawables;
    private int size;

    public Drawing() {
        drawables = new Drawable[500000];
        size = 0;
    }

    public void add(Drawable drawable) {
        int index = findElementIndex(null);
        if (findElementIndex(drawable) != -1) {
            return;
        }

        if (index == -1) {
            drawables = Arrays.copyOf(drawables, drawables.length+1);
            index = drawables.length-1;
        }

        drawables[index] = drawable;
        size++;
    }

    public void remove(Drawable drawable) {
        int index = findElementIndex(drawable);
        if (index == -1) {
            return;
        }

        drawables[index] = null;
        size--;
    }

    private int findElementIndex(Drawable drawable) {
        for (int i = 0; i < drawables.length; i++) {
            // without Object.equals() =>  if (shapes[i] == shape || (shapes[i] != null && shapes[i].equals(shape))
            if (Objects.equals(drawables[i], drawable)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(drawables, null);
    }

    public int getSize() {
        return size;
    }

    @Override
    public void draw(DrawingContext dc) {
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.draw(dc);
            }
        }
    }

    @Override
    public void scale(int factor) {
        for (Drawable drawable : drawables) {
            if (drawable != null) {
                drawable.scale(factor);
            }
        }
    }

    @Override
    public String toString(){
        String toReturn = "";
        for (Drawable drawable : drawables) {
            if (drawable != null ) {
                toReturn += drawable.toString() + "\n";
            }
        }
        return toReturn;
    }

    public void add(Drawable... drawables) {
        for (Drawable drawable : drawables) {
            add(drawable);
        }
    }

    @Override
    public Iterator<Drawable> iterator() {
        return new DrawableIterator();
    }

    class DrawableIterator implements Iterator<Drawable> {

        private int indexNextElement = 0;

        @Override
        public boolean hasNext() {
            while(true) {
                if (indexNextElement >= drawables.length) {
                    return false;
                }

                if (drawables[indexNextElement] != null) {
                    return true;
                } else {
                    indexNextElement++;
//                return hasNext();
                }
            }
        }

        @Override
        public Drawable next() {
            return drawables[indexNextElement++];
        }
    }
}
