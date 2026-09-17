import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valoresOriginais = new int[5];

        for (int i = 0; i < valoresOriginais.length; i++) {
            System.out.printf("Digite o valor da posição %d: ", i);
            valoresOriginais[i] = scanner.nextInt();
        }

        int soma = 0;
        int maior = valoresOriginais[0];
        int menor = valoresOriginais[0];
        int negativos = 0;
        int impares = 0;

        for (int valor : valoresOriginais) {
            soma += valor;

            if (valor > maior) {
                maior = valor;
            }
            if (valor < menor) {
                menor = valor;
            }
            if (valor < 0) {
                negativos++;
            }
            if (valor % 2 != 0) {
                impares++;
            }
        }

        double media = (double) soma / valoresOriginais.length;

        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Quantidade de valores negativos: " + negativos);
        System.out.println("Quantidade de valores ímpares: " + impares);

        scanner.close();
    }
/*
a. Desenvolva um programa que realize a leitura de 5 valores inteiros a partir do teclado e armazene-os em um vetor (identificado como
valoresOriginais ). Após isso, deve-se apresentar mensagens que informam qual foi:
■ a média dos valores informados
■ o maior valor informado
■ o menor valor informado
■ quantos valores negativos foram informados
■ quantos valores ímpares foram informados
*/
}