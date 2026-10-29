import java.util.EmptyStackException;

/**
 * Pilha (LIFO) com vetor de tamanho FIXO (X = 10).
 *
 *   topIndex = posicao do elemento do topo (-1 quando vazia)
 *   Base na posicao 0; o topo e sempre o ultimo elemento ocupado.
 *
 *   [ 1 ][ 2 ][ 3 ][ - ][ - ] ...      counter = 3, topIndex = 2
 *                ^ topo
 */
public class PilhaComArray implements Pilha {

	private Integer[]			array;
	private int					counter;
	private int					topIndex;
	private final static int	X = 10;

	public PilhaComArray() {
		this.array    = new Integer[X];
		this.counter  = 0;
		this.topIndex = -1;                 // -1 = "nao ha topo" (pilha vazia)
	}

	@Override
	public void push(Integer element) {
		if (counter == array.length) {      // cheia e tamanho fixo: nao entra
			return;
		}

		topIndex++;
		array[topIndex] = element;
		counter++;
	}

	@Override
	public Integer pop() {
		if (counter == 0) {
			throw new EmptyStackException();
		}

		Integer info = array[topIndex];     // guarda ANTES de limpar
		array[topIndex] = null;
		topIndex--;
		counter--;

		return info;
	}

	@Override
	public Integer top() {
		if (counter == 0) {
			throw new EmptyStackException();
		}

		return array[topIndex];
	}

	@Override
	public void clear() {
		array    = new Integer[X];
		counter  = 0;
		topIndex = -1;
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
		String myarray1 = "TOP [";
		for (int i = topIndex; i >= 0; i--) {   // do topo ate a base
			myarray1 += array[i];
			if (i != 0) {
				myarray1 += ", ";
			}
		}
		myarray1 += "]";
		return myarray1;
	}
}
