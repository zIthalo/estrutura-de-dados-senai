import java.util.NoSuchElementException;

/**
 * Fila (FIFO) com vetor de tamanho FIXO (X = 10), usado de forma CIRCULAR.
 *
 *   startIndex = posicao do primeiro elemento da fila
 *   counter    = quantos elementos existem
 *   o proximo a entrar vai em (startIndex + counter) % X
 *
 * Por que circular? Ao remover do inicio nao precisamos deslocar ninguem
 * (custo constante): basta avancar startIndex. As posicoes liberadas no comeco
 * do vetor sao reaproveitadas quando a fila "da a volta".
 *
 *   X = 5, startIndex = 3, counter = 4  ->  [ c ][ d ][ - ][ a ][ b ]
 *                                              ^ 5o a entrar    ^ startIndex
 *                                              (posicao 0)
 */
public class FilaComArray implements Fila {

	private Integer[]			array;
	private int					counter;
	private int					startIndex;
	private final static int	X = 10;

	public FilaComArray() {
		this.array      = new Integer[X];
		this.counter    = 0;
		this.startIndex = 0;
	}

	@Override
	public void add(Integer element) {
		if (counter == array.length) {      // cheia e tamanho fixo: nao entra (mesma logica da ListaComArray nao redimensionavel)
			return;
		}

		int endIndex = (startIndex + counter) % array.length;
		array[endIndex] = element;
		counter++;
	}

	@Override
	public Integer remove() {
		if (counter == 0) {
			throw new NoSuchElementException();
		}

		Integer info = array[startIndex];   // guarda ANTES de limpar
		array[startIndex] = null;
		startIndex = (startIndex + 1) % array.length;
		counter--;

		return info;
	}

	@Override
	public void clear() {
		array      = new Integer[X];
		counter    = 0;
		startIndex = 0;
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
		for (int i = 0; i < counter; i++) {
			myarray1 += array[(startIndex + i) % array.length];
			if (i != (counter - 1)) {
				myarray1 += ", ";
			}
		}
		myarray1 += "] FIM";
		return myarray1;
	}
}
