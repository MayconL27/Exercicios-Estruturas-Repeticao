package Array;

import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        /** Faça um Programa que leia 20 números 
         * inteiros aleatórios (entre 0 e 100) 
         * armazene-os num vetor.Ao final mostre 
         * os números e seus sucessores. 
         */
        Random random = new Random();

        int[] numAleatorios = new int[20];

        for (int i = 0; i < numAleatorios.length; i++) {
            int numero = random.nextInt(100); // limitando entre 0 e 100.
            numAleatorios[i] = numero;
        }

        System.out.print("Números aleatorios: ");
        for (int numero : numAleatorios) {
            System.out.print(numero + " ");
        }

        System.out.print("\nAntecessores: ");
        for (int numero : numAleatorios) {
            System.out.print((numero - 1) + " ");
        }

        System.out.print("\nSucessores: ");
        for (int i : numAleatorios) {
            System.out.print((i + 1)+ " ");
        }
    }
}
