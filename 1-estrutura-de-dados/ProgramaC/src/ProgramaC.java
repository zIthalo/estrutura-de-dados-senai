import java.util.Scanner;

public class ProgramaC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valoresOriginais = new int[8];

        for (int i = 0; i < valoresOriginais.length; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            valoresOriginais[i] = scanner.nextInt();
        }

        System.out.print("Digite o valor a ser buscado: ");
        int valorBuscado = scanner.nextInt();

        int contador = 0;
        for (int valor : valoresOriginais) {
            if (valor == valorBuscado) {
                contador++;
            }
        }

        System.out.println("O valor " + valorBuscado + " aparece " + contador + " vez(es) no vetor.");

        scanner.close();
    }
/*
c. Desenvolva um programa que realize a leitura de 8 valores inteiros a partir do teclado e armazene-os em um vetor (identificado como
valoresOriginais ). Solicite um valor a ser buscado dentro do vetor ao usuário e contabilize quantas vezes o valor está presente do
vetor. Ao final, apresente a contabilização ao utilizador do programa.
*/
}