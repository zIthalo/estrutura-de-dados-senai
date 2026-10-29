public interface Pilha {

	public void    push(Integer element);  // empilha (no topo)
	public Integer pop();                  // desempilha (do topo)
	public Integer top();                  // espia o topo, sem remover
	public void    clear();
	public boolean isEmpty();
	public int     size();
}
