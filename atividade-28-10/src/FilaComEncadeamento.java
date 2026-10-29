import java.util.NoSuchElementException;

/**
 * Fila (FIFO) com nos encadeados.
 *
 *   first -> [80|.] -> [1|.] -> [23|null]
 *   (inicio)                    ^ last (final)
 *
 * Insere no FINAL (via last, custo constante) e remove do INICIO (via first).
 */
public class FilaComEncadeamento implements Fila {

	private NoLista	first;
	private NoLista	last;
	private int		counter;

	public FilaComEncadeamento() {
		this.first   = null;
		this.last    = null;
		this.counter = 0;
	}

	@Override
	public void add(Integer element) {
		NoLista node = new NoLista(element, null);

		if (first == null) {
			this.first = node;              // fila vazia: o no e o primeiro...
		} else {
			this.last.setNext(node);        // senao, encaixa depois do ultimo
		}

		this.last = node;                   // ...e sempre passa a ser o ultimo
		counter++;
	}

	@Override
	public Integer remove() {
		if (counter == 0) {
			throw new NoSuchElementException();
		}

		Integer info = first.getInfo();     // guarda ANTES de mexer em first
		first = first.getNext();
		counter--;

		if (first == null) {                // esvaziou: nao deixa "last" apontando para no morto
			last = null;
		}

		return info;
	}

	@Override
	public void clear() {
		first   = null;
		last    = null;
		counter = 0;
	}

	@Override
	public boolean isEmpty() {
		return (counter == 0);
	}

	@Override
	public int size() {
		return counter;
	}

	@Override
	public String toString() {
		String myarray1 = "INI [";
		NoLista aux = first;
		while (aux != null) {
			myarray1 += aux.getInfo();
			if (aux.getNext() != null) {
				myarray1 += ", ";
			}
			aux = aux.getNext();
		}
		myarray1 += "] FIM";
		return myarray1;
	}
}
