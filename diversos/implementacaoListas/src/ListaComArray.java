public class ListaComArray<E> {

    private E[] array;
    private boolean resizable;
    private int initialCapacity;
    private int counter;
    private final static int x = 10;

    public ListaComArray() {
        this(10);
    }

    public ListaComArray(int initialCapacity) {
        this(initialCapacity, true);
    }

    public ListaComArray(int initialCapacity, boolean resizable) {
        this.initialCapacity = initialCapacity;
        this.resizable = resizable;
        this.counter = 0;
        this.array = (E[]) new Object[initialCapacity];
    }

    public boolean add(E obj) {

        if (counter >= array.length) {

            if (!resizable) {
                return false;
            }

            resizeArrayList();
        }

        array[counter] = obj;
        counter++;

        return true;
    }

    public boolean add(int index, E element) {

        if (index < 0 || index > counter) {
            return false;
        }

        if (counter == array.length) {

            if (resizable) {
                resizeArrayList();
            } else {
                return false;
            }
        }

        for (int i = counter; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = element;
        counter++;

        return true;
    }

    private void resizeArrayList() {

        E novo[] = (E[]) new Object[array.length + x];

        System.arraycopy(array, 0, novo, 0, counter);

        array = novo;
    }

    public E remove(int index) {

        if (index < 0 || index >= counter) {
            return null;
        }

        E elementoRemovido = array[index];

        for (int i = index; i < counter - 1; i++) {
            array[i] = array[i + 1];
        }

        array[counter - 1] = null;
        counter--;

        return elementoRemovido;
    }

    public boolean removeFirst(E element) {

        int index = indexOf(element);

        if (index == -1) {
            return false;
        }

        remove(index);

        return true;
    }

    public E get(int index) {

        if (index < 0 || index >= counter) {
            return null;
        }

        return array[index];
    }

    public void clear() {

        if (resizable) {
            array = (E[]) new Object[initialCapacity];
        }

        counter = 0;
    }

    public int size() {
        return counter;
    }

    public E set(int index, E element) {

        if (index < 0 || index >= counter) {
            return null;
        }

        E old = array[index];

        array[index] = element;

        return old;
    }

    public boolean isEmpty() {
        return (counter == 0);
    }

    public boolean isFull() {

        if (!resizable) {
            return (counter == array.length);
        }

        return false;
    }

    public int contains(E element) {

        for (int i = 0; i < counter; i++) {

            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public int indexOf(E element) {

        for (int i = 0; i < counter; i++) {

            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(E element) {

        for (int i = (counter - 1); i >= 0; i--) {

            if (array[i].equals(element)) {
                return i;
            }
        }

        return -1;
    }

    public E[] toArray() {

        E[] novoArray = (E[]) new Object[counter];

        for (int i = 0; i < counter; i++) {
            novoArray[i] = array[i];
        }
        return novoArray;
    }
}