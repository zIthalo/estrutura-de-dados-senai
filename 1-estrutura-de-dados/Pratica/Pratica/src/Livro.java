public class Livro {
    
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void ExibirDados(){
        System.out.println("Título: " + this.titulo + " Autor: " + this.autor + " Ano: " + this.ano);
    }

    public boolean ehAntigo(){
        int anoAtual = 2026;

        return (anoAtual - this.ano) > 20;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public int getAno() {
        return ano;
    }
    

    
}
