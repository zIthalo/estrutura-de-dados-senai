public class FilaComArray implements Fila {

    private Integer[] elements;
    private int counter;

    public FilaComArray() {
        this.elements = new Integer[10];
        this.counter = 0;
    }

    @Override
    public void add(Integer element) {

        if (this.counter == this.elements.length) {
            throw new IllegalStateException("A fila está cheia.");
        }

        this.elements[this.counter] = element;
        this.counter++;
    }

    @Override
    public Integer remove() {

        if (isEmpty()) {
            return null;
        }

        Integer element = this.elements[0];

        for (int i = 0; i < this.counter - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[this.counter - 1] = null;

        this.counter--;

        return element;
    }

    @Override
    public void clear() {

        for (int i = 0; i < this.counter; i++) {
            this.elements[i] = null;
        }

        this.counter = 0;
    }

    @Override
    public boolean isEmpty() {
        return this.counter == 0;
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public String toString() {

        String result = "[";

        for (int i = 0; i < this.counter; i++) {

            result += this.elements[i];

            if (i < this.counter - 1) {
                result += ", ";
            }
        }

        result += "]";

        return result;
    }
}