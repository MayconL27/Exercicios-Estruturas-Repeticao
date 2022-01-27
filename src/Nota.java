import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        /** Faça um programa que peça uma nota, entre zero e dez. 
         * Mostre uma mensagem caso o valor seja inválidoe continue 
         * pedindo até que o usuário informe um valor válido. 
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite uma nota entre zero e dez:");
         int nota = sc.nextInt();

         while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida!");
            System.out.println("Digite uma nota entre zero e dez:");
            nota = sc.nextInt();
             
         }
         System.out.println("Nota Válida: " + nota);
    }
    
}
