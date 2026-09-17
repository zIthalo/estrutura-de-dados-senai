import java.util.Scanner;

public class Somatorio {

    public static int somatorio(int x) {
        if (x <= 0) {
            return 0;
        }
        return x + somatorio(x - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int x = scanner.nextInt();

        int resultado = somatorio(x);

        System.out.println("O somatório de 1 até " + x + " é: " + resultado);

        scanner.close();
    }
/*
Desenvolver um programa para calcular, por meio de um método recursivo (somatorio(int x) : int), o somatório de todos os números
de 1 até um determinado valor ‘x’. O valor de ‘x’ deve ser solicitado dentro do método main, a partir da interação com o utilizador/usuário. Uma
vez que o somatório fora calculado, deve-se apresentar o resultado na tela. Exemplo: ao informar 10, o programa deve mostrar 55, isso porque
1+2+3+4+5+6+7+8+9+10 = 5.
*/
}