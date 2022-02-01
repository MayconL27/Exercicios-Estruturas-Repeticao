import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        /** Faça um programa que calcule o fatorial de 
         * um número inteiro fornecido pelo  usuário.
         * Ex. : 5! = 120 (5 x 4 x 3 x 2 x 1)
         * */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o número para saber o fatorial");
         int numFat = sc.nextInt();

         int soma = 1;

         for (int i = 5; i >= 1; i--) {
             soma = soma * i;
             
         }
         System.out.println("Fatorial de " + numFat + " é " + soma);
    }
    
}
