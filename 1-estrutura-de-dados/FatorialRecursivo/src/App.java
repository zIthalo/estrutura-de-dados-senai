import java.util.Scanner;

public class App {

    public static int fatorial(int numero){
        if (numero <= 1) {
            return 1;
        }
        return numero * fatorial(numero -1);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = sc.nextInt();

        int resultado = fatorial(numero);

        System.out.printf("O fatorial de %d é: %d", numero, resultado);

        sc.close();
    }

/*
Crie um método fatorial(int numero) : int que recebe um número inteiro como argumento e retorna o fatorial deste número. Dentro
do método main, solicite ao usuário para inserir um número e use o método fatorial para calcular o fatorial deste número informado. Por fim,
apresente o resultado ao utilizador.    
*/
}
