import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] caracteresInformados = new char[10];

        for (int i = 0; i < caracteresInformados.length; i++) {
            System.out.printf("Digite o caractere da posição %d: ", i);
            caracteresInformados[i] = scanner.next().charAt(0);
        }

        System.out.print("Digite o caractere a ser buscado: ");
        char caractereBuscado = scanner.next().charAt(0);

        boolean encontrado = false;
        for (char caractere : caracteresInformados) {
            if (caractere == caractereBuscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("O caractere '" + caractereBuscado + "' existe no vetor.");
        } else {
            System.out.println("O caractere '" + caractereBuscado + "' não existe no vetor.");
        }

        scanner.close();
    }
/*
d. Desenvolva um programa que realize a leitura de 10 valores char a partir do teclado e armazene-os em um vetor (identificado como
caracteresInformados ). Solicite um caractere a ser buscado dentro do vetor ao usuário e apresente uma mensagem informando
se o caractere informado existe ou não dentro do vetor.
*/
}