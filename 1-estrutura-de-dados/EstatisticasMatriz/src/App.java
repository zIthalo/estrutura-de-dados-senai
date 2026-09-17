import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Preenchendo a matriz:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int somaTotal = 0;
        for (int i = 0; i < 4; i++) {
            int somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
                somaTotal += matriz[i][j];
            }
            System.out.println("Soma da linha " + i + ": " + somaLinha);
        }

        double media = (double) somaTotal / (4 * 4);
        System.out.println("Média geral dos valores: " + media);

        for (int j = 0; j < 4; j++) {
            int menorColuna = matriz[0][j];
            for (int i = 1; i < 4; i++) {
                if (matriz[i][j] < menorColuna) {
                    menorColuna = matriz[i][j];
                }
            }
            System.out.println("Menor valor da coluna " + j + ": " + menorColuna);
        }

        scanner.close();
    }
/*
c. Desenvolva um programa que solicite valores ao usuário para popular uma
matriz 4x4. Após isso, deve-se apresentar mensagens que informam qual foi:
■ a média dos valores armazenados na matriz
■ a soma de cada uma das linhas
■ o menor valor em cada uma das colunas
*/
}