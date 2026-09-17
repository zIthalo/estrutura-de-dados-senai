import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Informe até que número você quer somar: ");
        int numero = sc.nextInt();
        int resultado = somarAte(numero);

        System.out.printf("A soma de 1 até %d é: %d", numero, resultado);
        




        sc.close();
    }

    public static int somarAte(int numero){
        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            soma+=i;
        }
        System.out.println("Somando...");
        return soma;
    }
}


// Crie um método somarAte(int numero) : int que recebe um número como argumento e retorna a soma dos números inteiros até o valor desejado. Dentro do método main, peça ao usuário para inserir um número e use o método somarAte para realizar a soma. Por fim, apresente a soma ao utilizador.
