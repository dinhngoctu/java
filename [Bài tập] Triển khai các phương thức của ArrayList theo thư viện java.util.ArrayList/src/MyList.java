import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    Object[] elements;

    public MyList() {
    }

    public MyList(int capacity) {
        size = capacity / DEFAULT_CAPACITY;
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = element;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        int newsize = elements.length - 1;
        for (int i = index; i < elements.length - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements = Arrays.copyOf(elements, newsize);
        return temp;
    }

    public int size() {
        if (elements.length > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return elements.length;
    }
    public E clone(){
        E[] clone = new Object[elements.length];
    }
}
