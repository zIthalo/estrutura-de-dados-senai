import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizResultado = new int[3][3];

        System.out.println("Preenchendo a Matriz A:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matrizA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Preenchendo a Matriz B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matrizB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizResultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        System.out.println("Matriz resultante:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
/*
a. Desenvolva um programa que soma duas matrizes 3x3 (valores inteiros), sendo
que os valores de cada uma das matrizes foi solicitado ao usuário. Ao final,
mostre a matriz resultante.
*/
}