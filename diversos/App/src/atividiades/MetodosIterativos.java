package atividiades;

import java.util.Scanner;

public class MetodosIterativos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        int n1 = sc.nextInt();

        System.out.println("O resultado da soma dos números até " + n1 + " é igual a: " + somarAte(n1));

        sc.close();
    }

public static int somarAte(int numero){
    
    int soma = 0;
    for (int i = 1; i <= numero; i++) {
        soma += i;
        
    }
     return soma;
    
}

}
