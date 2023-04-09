package list.app;

import java.util.NoSuchElementException;

public class ArrayListIteratorCopy<E> implements ListIterator<E>{
    private E[] elements;
    private int index;

    public ArrayListIteratorCopy(E[] elements) {
        this.elements = elements;
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

