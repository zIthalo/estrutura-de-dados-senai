import java.util.Scanner;

public class App {
    
    public static int somarAte(int numero){
        if (numero <=0) {
            return 0;
        }
        return numero + somarAte(numero -1);
    }
    
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int resultado = somarAte(numero);

        System.out.printf("A soma de 1 até %d é: %d", numero, resultado);


        sc.close();
    }



/*
Crie um método somarAte(int numero) : int que recebe um número como argumento e retorna a soma dos números inteiros até o
valor desejado. Dentro do método main, peça ao usuário para inserir um número e use o método somarAte para realizar a soma. Por fim,
apresente a soma ao utilizador.
*/
}
