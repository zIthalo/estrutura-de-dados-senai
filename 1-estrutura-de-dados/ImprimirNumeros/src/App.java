import java.util.Scanner;

public class App {

    public static void imprimirIterativo(int n) {
        for (int i = 0; i <= n; i++) {
            if (i > 0) {
                System.out.print(" ");
            }
            System.out.print(i);
        }
        System.out.println();
    }

    public static void imprimirRecursivo(int n) {
        if (n == 0) {
            System.out.print(0);
            return;
        }
        imprimirRecursivo(n - 1);
        System.out.print(" " + n);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = scanner.nextInt();

        System.out.print("Forma iterativa: ");
        imprimirIterativo(n);

        System.out.print("Forma recursiva: ");
        imprimirRecursivo(n);
        System.out.println();

        scanner.close();
    }
/*
Desenvolver um programa que imprima, de duas formas diferentes, os números de 0 até um determinado valor ‘n’. O valor de ‘n’ deve ser
solicitado dentro do método main, por meio da interação com o utilizador/usuário. O programa deve conter dois métodos adicionais além do
main: Um método iterativo (imprimirIterativo(int n)) Um método recursivo (imprimirRecursivo(int n)) Ambos os métodos
devem receber o valor de ‘n’ como parâmetro e, quando invocados, devem imprimir na tela todos os números de 0 até ‘n’, em uma única linha,
separados por espaço. Exemplo: ao informar o valor 5, o programa deve imprimir: 0 1 2 3 4 5

*/
}