import java.util.Scanner;

public class App {

        public static int somarValoresVetor(int valores[]){
            int soma = 0;

            for (int i = 0; i < valores.length; i++) {
                soma += valores[i];
            }

            return soma;
        }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        int[] valores = new int[tamanho];

        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Digite o valor da poição %d: ", i);
            valores[i] = sc.nextInt();
        }
        
        int resultado = somarValoresVetor(valores);
        System.out.printf("A soma dos valores do vetor é: %d%n", resultado);

        sc.close();
    }




/*
Crie um método somarValoresVetor(int valores[]) : int que recebe um vetor de inteiros como argumento e retorna a soma dos
números contidos no vetor. Dentro do método main, peça ao usuário um número inteiro para o tamanho do vetor, feito isso, solicite também
valores inteiros para popular todas as posições deste vetor. Utilize o método somarValoresVetor para realizar a soma. Por fim, apresente a
soma ao utilizador.

*/
}
