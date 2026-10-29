import java.util.NoSuchElementException;

public class TesteDaFila {

	static int falhas = 0;

	static void confere(String nome, Object esperado, Object obtido) {
		boolean ok = (esperado == null) ? obtido == null : esperado.equals(obtido);
		if (!ok) {
			falhas++;
			System.out.println("  FALHOU: " + nome + " | esperado=" + esperado + " obtido=" + obtido);
		}
	}

	static void bateria(String titulo, Fila f) {
		System.out.println("== " + titulo);

		confere("vazia toString", "INI [] FIM", f.toString());
		confere("vazia isEmpty", true, f.isEmpty());

		f.add(80); f.add(1); f.add(23); f.add(44); f.add(50);
		confere("apos 5 add", "INI [80, 1, 23, 44, 50] FIM", f.toString());
		confere("size", 5, f.size());
		confere("remove 1", 80, f.remove());
		confere("remove 2", 1, f.remove());
		confere("apos 2 remove", "INI [23, 44, 50] FIM", f.toString());

		// esvazia e reutiliza
		f.remove(); f.remove(); f.remove();
		confere("esvaziou", true, f.isEmpty());
		try { f.remove(); confere("remove vazia lanca", true, false); }
		catch (NoSuchElementException e) { /* esperado */ }
		f.add(7);
		confere("reuso apos esvaziar", "INI [7] FIM", f.toString());
		f.clear();
		confere("clear", "INI [] FIM", f.toString());
		confere("clear size", 0, f.size());

		// ordem FIFO com volta no vetor (wrap-around): 10 entram, 6 saem, 6 entram
		for (int i = 1; i <= 10; i++) f.add(i);
		for (int i = 1; i <= 6; i++) confere("fifo " + i, i, f.remove());
		for (int i = 11; i <= 16; i++) f.add(i);
		confere("wrap-around", "INI [7, 8, 9, 10, 11, 12, 13, 14, 15, 16] FIM", f.toString());
		confere("size cheia", 10, f.size());
		f.clear();
	}

	public static void main(String[] args) {
		bateria("FilaComEncadeamento", new FilaComEncadeamento());
		bateria("FilaComArray", new FilaComArray());

		System.out.println("== Especifico do vetor fixo (tamanho 10)");
		Fila f = new FilaComArray();
		for (int i = 1; i <= 12; i++) f.add(i);              // 11 e 12 nao cabem
		confere("fila cheia ignora excedentes", "INI [1, 2, 3, 4, 5, 6, 7, 8, 9, 10] FIM", f.toString());
		confere("size limitado a 10", 10, f.size());
		f.remove();
		f.add(99);                                            // agora cabe (ocupa a posicao liberada)
		confere("reaproveita posicao liberada", "INI [2, 3, 4, 5, 6, 7, 8, 9, 10, 99] FIM", f.toString());

		System.out.println("== Teste do slide (Aula 10)");
		Fila minhaFila = new FilaComEncadeamento();
		System.out.println(minhaFila);
		minhaFila.add(80); minhaFila.add(1); minhaFila.add(23); minhaFila.add(44); minhaFila.add(50);
		System.out.println(minhaFila);
		System.out.println("Quem saiu da fila: " + minhaFila.remove());
		System.out.println("Quem saiu da fila: " + minhaFila.remove());
		System.out.println(minhaFila);

		System.out.println(falhas == 0 ? "\nTODOS OS TESTES DA FILA PASSARAM" : "\nFALHAS: " + falhas);
	}
}
