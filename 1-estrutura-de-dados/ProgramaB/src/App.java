import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valoresOriginais = new int[8];

        for (int i = 0; i < valoresOriginais.length; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            valoresOriginais[i] = scanner.nextInt();
        }

        int[] valoresInvertidos = new int[valoresOriginais.length];

        for (int i = 0; i < valoresOriginais.length; i++) {
            valoresInvertidos[i] = valoresOriginais[valoresOriginais.length - 1 - i];
        }

        System.out.print("Vetor original: ");
        for (int valor : valoresOriginais) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.print("Vetor invertido: ");
        for (int valor : valoresInvertidos) {
            System.out.print(valor + " ");
        }
        System.out.println();

        scanner.close();
    }

/*
b. Desenvolva um programa que realize a leitura de 8 valores inteiros a partir do teclado e armazene-os em um vetor (identificado como
valoresOriginais ). Após isso, deve-se criar um novo vetor com o mesmo tamanho do anterior. Os valores informados pelo usuário
devem ser copiados ao novo vetor de forma que fiquem dispostos em ordem inversa ao original. Por fim, deve-se mostrar na tela os
valores contidos em ambos os vetores.

*/
}