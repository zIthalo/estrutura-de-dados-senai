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

        boolean simetrica = true;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    simetrica = false;
                }
            }
        }

        if (simetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz não é simétrica.");
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