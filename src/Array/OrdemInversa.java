package Array;

public class OrdemInversa {
    public static void main(String[] args) {
        /** Crie um vetor de 6 números inteiros e mostre-os na ordem inversa.*/

        int[] vetor = {1, 2, 3, 4, 5}; 
        int count = 0;

        System.out.println("Vetor ordem normal: ");
        while (count < vetor.length) {
            System.out.print(vetor[count] + " ");
            count++;
        }
        System.out.println("\nVetor inverso: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println("\nVetor ordem normal com for: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
}
