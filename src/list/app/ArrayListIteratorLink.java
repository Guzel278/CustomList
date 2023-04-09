package list.app;

import java.util.NoSuchElementException;

public class ArrayListIteratorLink<E> implements ListIterator<E>{
    private E[] elements;
    private int index;

    public ArrayListIteratorLink() {
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < elements.length;
    }

    @Override
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return elements[++index];
    }
}

