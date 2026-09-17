public class ListaComArray {

    private Integer[] array;
    private boolean resizable;
    private int initialCapaciy;
    private int counter;
    private final static int X = 10;

    public ListaComArray() {
        this(10);
    };

    public ListaComArray(int initialCapaciy) {
        this(initialCapaciy, true);
    };

    public ListaComArray(int initialCapaciy, boolean resizable) {
        this.initialCapaciy = initialCapaciy;
        this.resizable = resizable;
        this.counter = 0;
        this.array = new Integer[initialCapaciy];
    };

    public boolean add(Integer obj) {

        if (counter >= array.length) {
            if (!resizable) {
                return false;
            };
            resizeArrayList();
        };

        array[counter] = obj;
        counter++;

        return true;

    };

    public boolean add(int index, Integer element) {
        if (index < 0 || index > counter) {
            return false;
        }

        if (counter >= array.length) {
            if (!resizable) {
                return false;
            }

            resizeArrayList();

        }
        for (int i = counter; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        counter++;
        return true;

    };

    private void resizeArrayList() {

        Integer[] novo = new Integer[array.length + X];

        for (int i = 0; i < counter; i++) {
            novo[i] = array[i];
        }

        array = novo;
    };

    public Integer remove(int index) {
        return 0;
    };

    public boolean removeFirst(Integer element) {
        return false;
    };

    public Integer get(int index) {
        return 0;
    }

    public void clear() {

    };

    public Integer set(int index, Integer element) {
        return 0;
    };

    public int size() {
        return 0;
    };

    public boolean isEmpty() {
        return false;
    };

    public boolean isFull() {
        return false;
    };

    public int contains(Integer element) {
        return 0;
    };

    public int indexOf(Integer element) {
        return 0;
    };

    public int lastIndexOf(Integer element) {
        return 0;
    };

    public Integer[] toArray() {
        return array;
    };

    public String toString() {
        return "";
    };

}