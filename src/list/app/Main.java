package list.app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(5);
       System.out.println(list.size());
       list.add(8);
       System.out.println(list.size());
       list.insert(2,5);
       list.remove(8);

       Integer[] array = {23, 4, 5, 2, 13, 456, 4};
       ListIterator<Integer> iteratorCopy = new ArrayListIteratorCopy<Integer>(array);
       ListIterator iteratorLink = new ArrayListIteratorLink();
        //System.out.println(iteratorLink.hasNext());
        //System.out.println(iteratorLink.next());
        System.out.println(iteratorCopy.hasNext());
        System.out.println(iteratorCopy.next());

    }
}