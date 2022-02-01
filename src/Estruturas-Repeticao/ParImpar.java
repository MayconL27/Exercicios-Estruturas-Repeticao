import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        /** Faça um programa que peça N números inteiros, 
         * calcule e mostre a quantidade de numeros pares 
         * e a quantidade de números impares. 
         */

         Scanner sc = new Scanner(System.in);

         int quantNum = 0;
         int contador = 0;
         int quantPar = 0;
         int quantImpar = 0;


         System.out.println("Digite a quantidade de números:");
         quantNum = sc.nextInt();

         do {
            System.out.println("Digite um número para saber se é par ou impar:");
            int num = sc.nextInt();

            if (num % 2 == 0) {
                System.out.println(num + " é um número par");
                quantPar++;
            } else {
                System.out.println(num + " é um número impar");
                quantImpar++;
            }
            contador++;       
         } while (contador < quantNum);

         System.out.println("Quantidade de pares: " + quantPar);
         System.out.println("Quantidade de impares: " + quantImpar);
    }
    
}
