public class App {

    public static void main(String[] args) {

        System.out.println("===== FILA ENCADEADA =====");

        Fila filaEncadeada = new FilaComEncadeamento();

        filaEncadeada.add(10);
        filaEncadeada.add(20);
        filaEncadeada.add(30);

        System.out.println("Fila: " + filaEncadeada);
        System.out.println("Tamanho: " + filaEncadeada.size());
        System.out.println("Está vazia? " + filaEncadeada.isEmpty());

        System.out.println("Removido: " + filaEncadeada.remove());

        System.out.println("Fila depois da remoção: " + filaEncadeada);

        filaEncadeada.clear();

        System.out.println("Fila depois do clear: " + filaEncadeada);
        System.out.println("Tamanho: " + filaEncadeada.size());


        System.out.println();
        System.out.println("===== FILA COM ARRAY =====");

        Fila filaArray = new FilaComArray();

        filaArray.add(100);
        filaArray.add(200);
        filaArray.add(300);

        System.out.println("Fila: " + filaArray);
        System.out.println("Tamanho: " + filaArray.size());
        System.out.println("Está vazia? " + filaArray.isEmpty());

        System.out.println("Removido: " + filaArray.remove());

        System.out.println("Fila depois da remoção: " + filaArray);
    }
}