import java.util.Random;

public class Exercicio01 {

    public static int somaVetorIterativo(int[] vetor){
        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma;
    }

    public static int somaVetorRecursivo(int[] vetor, int i){
        if (i < 0) {
            return i;
        }
        return vetor[i] = somaVetorRecursivo(vetor, i - 1);
    }

    public static void main(String[] args) {
        
        int tamanho =  2300;
        
        int[] vetor = new int[tamanho];

        Random rand = new Random();

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(100);
        }

        long t0 = System.currentTimeMillis();
        
        int somaIterativa = somaVetorIterativo(vetor);
        long t1 = System.currentTimeMillis();

        long t2 = System.currentTimeMillis();
        int somaRecursiva = somaVetorRecursivo(vetor, vetor.length - 1);
        long t3 = System.currentTimeMillis();

        System.out.println("Soma Iterativa: " + somaIterativa + " (Tempo: " + (t1 - t0) + " ms)");
        System.out.println("Soma Recursiva: " + somaRecursiva + " (Tempo: " + (t3 - t2) + " ms)");

        if ((t1 - t0) < (t3 - t2)){
            System.out.println("A abordagem iterativa foi mais rápida.");
        }else{
            System.out.println("A abordagem recursiva foi mais rápida.");
        }
               

    }
}