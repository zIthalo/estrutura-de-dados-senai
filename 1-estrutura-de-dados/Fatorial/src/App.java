import java.util.Scanner;

public class App {

    public static long fatorial(int numero){
        long resultado = 1;

        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }


    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um númerod para calcular o seu fatorial: ");
        int numero = sc.nextInt();

        long resultado = fatorial(numero);

        System.out.printf("O fatorial de %d é %d. ", numero, resultado);


        sc.close();
    }
}
/*
Crie um método fatorial(int numero) : int que recebe um número inteiro como argumento e retorna o fatorial deste número. Dentro
do método main, solicite ao usuário para inserir um número e use o método fatorial para calcular o fatorial deste número informado. Por fim,
apresente o resultado ao utilizador.
*/