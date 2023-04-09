package list.app;
public class ArrayList<E> implements List<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];


    ArrayList()
    {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E object)
    {
      if(elements.length == size) {
          increaseCapacity();
      }
        elements[size] = object;
        size++;
    }
    private void increaseCapacity()
    {
        Object newElem [] = new Object[size *2];
        for(int i = 0; i< elements.length; i++){
            newElem[i] = elements[i];
        }
        elements = newElem;
    }
    @SuppressWarnings("unchecked")
    public void insert(int pos, E object){
        if(size < pos || pos < 0) {
            throw new IllegalArgumentException();
        }
        if(elements.length - 1 == size){
            increaseCapacity();
        }
        else if(pos == elements.length-1){
            elements[pos] = object;
        }
        else{
            for(int i = size; i>=pos; i--){
                 elements[i] = elements[i-1];
            }
            elements[pos]=object;
        }

    }
    public int size()
    {
      return size;
    }

    public void remove(E object)throws UnsupportedOperationException {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(object)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            throw new UnsupportedOperationException("Element not found");
        }
        System.arraycopy(elements, index + 1, elements, index, size - index - 1);
        size--;
    }
}
