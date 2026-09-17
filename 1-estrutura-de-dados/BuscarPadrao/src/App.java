import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas (M) da imagem: ");
        int m = scanner.nextInt();
        System.out.print("Digite o número de colunas (N) da imagem: ");
        int n = scanner.nextInt();

        int[][] imagem = new int[m][n];

        System.out.println("Preenchendo a imagem (valores 0 ou 1):");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                imagem[i][j] = scanner.nextInt();
            }
        }

        int[][] padrao = new int[3][3];
        System.out.println("Preenchendo o padrão 3x3 a ser buscado (valores 0 ou 1):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                padrao[i][j] = scanner.nextInt();
            }
        }

        boolean encontrado = false;
        int linhaEncontrada = -1;
        int colunaEncontrada = -1;

        for (int i = 0; i <= m - 3 && !encontrado; i++) {
            for (int j = 0; j <= n - 3 && !encontrado; j++) {
                if (padraoBateNaPosicao(imagem, padrao, i, j)) {
                    encontrado = true;
                    linhaEncontrada = i;
                    colunaEncontrada = j;
                }
            }
        }

        if (encontrado) {
            System.out.println("Padrão encontrado a partir da posição [" + linhaEncontrada + "][" + colunaEncontrada + "].");
        } else {
            System.out.println("Padrão não encontrado na imagem.");
        }

        scanner.close();
    }

    private static boolean padraoBateNaPosicao(int[][] imagem, int[][] padrao, int linhaInicial, int colunaInicial) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (imagem[linhaInicial + i][colunaInicial + j] != padrao[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
/*
d. Uma matriz pode ser associada com a representação de uma imagem em preto
e branco, de tamanho MxN, cujos elementos assumem valores do conjunto A =
{0, 1}. Dado um padrão, representado por uma matriz 3x3 também assumindo
valores do conjunto A, desenvolva um programa que determina se o padrão
existe ou não na “imagem”. Crie uma matriz do tipo primitivo int de tamanho MxN
(os valores podem ser solicitados ou definidos no código). Deve-se popular essa
matriz com valores zeros e uns (pode-se atribuir aleatoriamente ou ser definido
posição por posição). Solicitar um padrão 3x3, conforme ilustrado e implementar
a lógica para identificar quantas vezes o padrão 3x3 aparece na
“imagem/matriz”
*/
}