public class FilaComEncadeamento implements Fila {

    private NoLista first;
    private NoLista last;
    private int counter;

    public FilaComEncadeamento() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    @Override
    public void add(Integer element) {

        NoLista novo = new NoLista(element, null);

        if (isEmpty()) {
            this.first = novo;
            this.last = novo;
        } else {
            this.last.setNext(novo);
            this.last = novo;
        }

        this.counter++;
    }

    @Override
    public Integer remove() {

        if (isEmpty()) {
            return null;
        }

        Integer element = this.first.getInfo();

        this.first = this.first.getNext();

        this.counter--;

        if (this.counter == 0) {
            this.last = null;
        }

        return element;
    }

    @Override
    public void clear() {
        this.first = null;
        this.last = null;
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
        NoLista current = this.first;

        while (current != null) {

            result += current.getInfo();

            if (current.getNext() != null) {
                result += ", ";
            }

            current = current.getNext();
        }

        result += "]";

        return result;
    }
}