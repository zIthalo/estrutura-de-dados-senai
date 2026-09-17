public class ListaComEncadeamento<E> implements Lista<E> {

    private NoLista<E>  first;
    private NoLista<E>  last;
    private int         counter;

    public ListaComEncadeamento() {
        this.first      = null;
        this.last       = null;
        this.counter    = 0;
    }



    @Override
    public void add(E element) {
        
        NoLista<E> node = new NoLista<E>();
        node.setInfo(element);

        if (counter == 0) {
            node.setInfo(element);
            this.first = node;
        } else {
            last.setNext(node);
        }
        this.last = node;
        counter++;
           
        

    }

    @Override
    public void add(int index, E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public E remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public boolean removeFirst(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'removeFirst'");
    }

    @Override
    public void clear() {
        this.first = null;
        this.last = null;
        this.counter = 0;
    }

    @Override
    public int size() {
        return this.counter;
    }

    @Override
    public boolean isEmpty() {
        return (this.counter == 0);
    }

    @Override
    public boolean contains(E element) {
        NoLista<E> current = this.first;

        while (current != null) {
            if (current.getInfo().equals(element)) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    @Override
    public int indexOf(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'indexOf'");
    }

    @Override
    public int lastIndexOf(E element) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'lastIndexOf'");
    }

    @Override
    public E[] toArray() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toArray'");
    }




}
