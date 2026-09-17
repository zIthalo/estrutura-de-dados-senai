import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valoresOriginais = new int[5];

        for (int i = 0; i < valoresOriginais.length; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            valoresOriginais[i] = scanner.nextInt();
        }

        int[] valoresFinais = new int[valoresOriginais.length * 3];

        for (int i = 0; i < valoresOriginais.length; i++) {
            int posicaoCentral = i * 3 + 1;
            valoresFinais[posicaoCentral - 1] = valoresOriginais[i] - 1;
            valoresFinais[posicaoCentral]     = valoresOriginais[i];
            valoresFinais[posicaoCentral + 1] = valoresOriginais[i] + 1;
        }

        System.out.print("Vetor original: ");
        for (int valor : valoresOriginais) {
            System.out.print(valor + " ");
        }
        System.out.println();

        System.out.print("Vetor final: ");
        for (int valor : valoresFinais) {
            System.out.print(valor + " ");
        }
        System.out.println();

        scanner.close();
    }
/*
e. Desenvolva um programa que realize a leitura de 5 valores inteiros a partir do teclado e armazene-os em um vetor (identificado como
valoresOriginais ). Após isso, deve-se criar um novo vetor com o triplo do tamanho do anterior. Os valores informados pelo
usuário deverão ser replicados nas posições 1, 4, 7, 10, 13 deste novo vetor (identificado como valoresFinais ). As demais posições
deste novo vetor deverão ser preenchidas com os valores que antecedem e sucedem os valores informados pelo usuário. Ao final
deve-se mostrar na tela os valores contidos em ambos os vetores.

*/
}