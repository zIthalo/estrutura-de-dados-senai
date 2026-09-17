import java.util.Scanner;

public class App {

    public static int contarCaracteres(char letras[], char letraBuscada) {

        int contador = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == letraBuscada) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("\nDigite o tamanho do vetor: ");
        int tamanho = sc.nextInt();

        char[] letras = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite a letra da posição %d: ", i);
            letras[i] = sc.next().charAt(0);
        }

        System.out.print("Digite a letra a ser buscada: ");
        char letraBuscada = sc.next().charAt(0);

        int resultado = contarCaracteres(letras, letraBuscada);
        System.out.printf("A letra '%s' aparece %d vez(es) no vetor.%n", letraBuscada, resultado);

        sc.close();
    }

    /*
     * Crie um método contarCaracteres(char letras[], char letraBuscada) : int que
     * recebe um vetor de char e uma letra a ser
     * buscada como argumento e retorna a quantidade de vezes que esta letra/char
     * “aparece” nas posições do vetor. Dentro do método main,
     * peça ao usuário um número inteiro para o tamanho do vetor, feito isso,
     * solicite também valores char para popular todas as posições deste
     * vetor, bem como uma letra a ser buscada/contabilizada. Utilize o método
     * contarCaracteres para realizar esta contabilização. Por fim,
     * apresente a quantidade de vezes que a letra buscada está presente no vetor ao
     * utilizador.
     * 
     */
}
