package Array;

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        /** Faça um programa que leia um vetor de 6 caracteres, 
         * e diga quantas consoantes foram lidas. imprima as consoantes.
         */
        Scanner sc = new Scanner(System.in);
         
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.println("Digite a letra: ");
            String letra = sc.nextLine();

            if (!(letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))) {
                    consoantes[count] = letra;
                    quantidadeConsoantes++;

                }
            count++;
            
        } while (count < consoantes.length);

        System.out.println("Consoantes: ");

        for (String consoante : consoantes) {
            if (consoante != null) // não mostrar posições null
            System.out.print(consoante + " - ");   
        }
        System.out.println(" Quantidades de consoantes: " + quantidadeConsoantes);
                
    }
    
}
