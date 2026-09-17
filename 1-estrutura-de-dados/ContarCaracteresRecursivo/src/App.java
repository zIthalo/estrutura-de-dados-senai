import java.util.Scanner;

public class App {

    public static int contarCaracteres(char letras[], char letraBuscada) {
        return contarCaracteres(letras, letraBuscada, 0);
    }

    public static int contarCaracteres(char letras[], char letraBuscada, int indice) {
        if (indice == letras.length) {
            return 0;
        }
        int restante = contarCaracteres(letras, letraBuscada, indice + 1);
        if (letras[indice] == letraBuscada) {
            return 1 + restante;
        }
        return restante;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = scanner.nextInt();

        char[] letras = new char[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.printf("Digite a letra da posição %d: ", i);
            letras[i] = scanner.next().charAt(0);
        }

        System.out.print("Digite a letra a ser buscada: ");
        char letraBuscada = scanner.next().charAt(0);

        int resultado = contarCaracteres(letras, letraBuscada);

        System.out.println("A letra '" + letraBuscada + "' aparece " + resultado + " vez(es) no vetor.");

        scanner.close();
    }
/*
Crie um método contarCaracteres(char letras[], char letraBuscada) : int que recebe um vetor de char e uma letra a ser
buscada como argumento e retorna a quantidade de vezes que esta letra/char “aparece” nas posições do vetor. Dentro do método main,
peça ao usuário um número inteiro para o tamanho do vetor, feito isso, solicite também valores char para popular todas as posições deste
vetor, bem como uma letra a ser buscada/contabilizada. Utilize o método contarCaracteres para realizar esta contabilização. Por fim,
apresente a quantidade de vezes que a letra buscada está presente no vetor ao utilizador.

*/
}