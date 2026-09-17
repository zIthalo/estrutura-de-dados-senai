public class Exercicio02 {
    public static void main(String[] args) {
        Livro[] vetorLivros = new Livro[5];

        vetorLivros[0] = new Livro("Pai", "Autor P", 2015);
        vetorLivros[1] = new Livro("Tio", "Autor A", 2020);
        vetorLivros[2] = new Livro("Mãe", "Autor B", 2000);
        vetorLivros[3] = new Livro("Avo", "Autor C", 1945);
        vetorLivros[4] = new Livro("Tia", "Autor B", 1855);

        System.out.println("\nTodos os livros.\n");
        for (Livro livro : vetorLivros) {
            livro.ExibirDados();
        }
        System.out.println("\n--------------------------------------\n");
        System.out.println("Livros antigos com mais de 20 anos\n");
        for (Livro livro : vetorLivros) {
            if (livro.ehAntigo()) {
                System.out.println(livro.getTitulo());
            }
        }
        
    }
}
