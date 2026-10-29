import java.util.EmptyStackException;

public class TesteDaPilha {

	static int falhas = 0;

	static void confere(String nome, Object esperado, Object obtido) {
		boolean ok = (esperado == null) ? obtido == null : esperado.equals(obtido);
		if (!ok) {
			falhas++;
			System.out.println("  FALHOU: " + nome + " | esperado=" + esperado + " obtido=" + obtido);
		}
	}

	static void bateria(String titulo, Pilha p) {
		System.out.println("== " + titulo);

		confere("vazia toString", "TOP []", p.toString());
		confere("vazia isEmpty", true, p.isEmpty());

		p.push(1); p.push(2); p.push(3);
		confere("apos 3 push", "TOP [3, 2, 1]", p.toString());
		confere("top", 3, p.top());
		confere("top nao remove", 3, p.size());
		confere("pop 1", 3, p.pop());
		confere("pop 2", 2, p.pop());
		confere("apos 2 pop", "TOP [1]", p.toString());
		p.push(10);
		confere("push apos pop", "TOP [10, 1]", p.toString());

		confere("pop 3", 10, p.pop());
		confere("pop 4", 1, p.pop());
		confere("esvaziou", true, p.isEmpty());
		try { p.pop(); confere("pop vazia lanca", true, false); }
		catch (EmptyStackException e) { /* esperado */ }
		try { p.top(); confere("top vazia lanca", true, false); }
		catch (EmptyStackException e) { /* esperado */ }

		p.push(7); p.push(8);
		p.clear();
		confere("clear", "TOP []", p.toString());
		confere("clear size", 0, p.size());
		p.push(5);
		confere("reuso apos clear", "TOP [5]", p.toString());
		p.clear();
	}

	public static void main(String[] args) {
		bateria("PilhaComEncadeamento", new PilhaComEncadeamento());
		bateria("PilhaComArray", new PilhaComArray());

		System.out.println("== Especifico do vetor fixo (tamanho 10)");
		Pilha p = new PilhaComArray();
		for (int i = 1; i <= 12; i++) p.push(i);             // 11 e 12 nao cabem
		confere("pilha cheia ignora excedentes", "TOP [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]", p.toString());
		confere("size limitado a 10", 10, p.size());
		confere("pop apos cheia", 10, p.pop());
		p.push(99);
		confere("push apos liberar", "TOP [99, 9, 8, 7, 6, 5, 4, 3, 2, 1]", p.toString());

		System.out.println(falhas == 0 ? "\nTODOS OS TESTES DA PILHA PASSARAM" : "\nFALHAS: " + falhas);
	}
}
