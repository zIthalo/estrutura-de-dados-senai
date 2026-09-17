import java.util.Scanner;

public class App {

    public static int fibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        int resultado = fibonacci(n);

        System.out.println("O " + n + "º termo da sequência de Fibonacci é: " + resultado);

        scanner.close();
    }
/*
Desenvolver um programa para calcular, por meio de um método recursivo (fibonacci(int n) : int), o n-ésimo termo da sequência de
Fibonacci. No método main, peça ao usuário para inserir um número e chame o método fibonacci para calcular o termo correspondente.
Exemplo: ao informar 4, o programa deve mostrar o valor 5, isso porque 5 é o 4º termo da sequência de Fibonacci. Lembre-se que a
sequência de Fibonacci é uma sequência de números em que cada número subsequente é a soma dos dois anteriores. A sequência
geralmente começa com 0 e 1. Portanto, os primeiros termos da sequência de Fibonacci são: 0, 1, 1, 2, 3, 5, 8, 13, 21, … Para encontrar o quarto
termo da sequência de Fibonacci, podemos aplicar a definição da sequência. Começamos com os dois primeiros termos: 0 e 1, e então
somamos esses dois termos para obter o terceiro termo. Em seguida, somamos o segundo e o terceiro termos para obter o quarto termo:
i. 0 + 1 = 1 (primeiro termo)
ii. 1 + 1 = 2 (segundo termo)
iii. 1 + 2 = 3 (terceiro termo)
iv. 2 + 3 = 5 (quarto termo)
*/
}