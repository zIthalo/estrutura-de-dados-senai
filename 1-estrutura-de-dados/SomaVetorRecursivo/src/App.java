import java.util.Scanner;

public class App {

     public static int somarValoresVetor(int valores[]) {
        return somarValoresVetor(valores, 0);
    }

    private static int somarValoresVetor(int valores[], int indice) {
        if (indice == valores.length) {
            return 0;
        }
        return valores[indice] + somarValoresVetor(valores, indice + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        int[] valores = new int[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            valores[i] = scanner.nextInt();
        }

        int resultado = somarValoresVetor(valores);

        System.out.println("A soma dos valores do vetor é: " + resultado);

        scanner.close();
    }


/*
Crie um método somarValoresVetor(int valores[]) : int que recebe um vetor de inteiros como argumento e retorna a soma dos
números contidos no vetor. Dentro do método main, peça ao usuário um número inteiro para o tamanho do vetor, feito isso, solicite também
valores inteiros para popular todas as posições deste vetor. Utilize o método somarValoresVetor para realizar a soma. Por fim, apresente a
soma ao utilizador.

*/
}
