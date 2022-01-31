import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        /** Faça um programa que leia 5 números e informe o maior número 
         * e a média desses números. 
         */
         Scanner sc = new Scanner(System.in);

         int num;
         int contador = 0;
         int media = 0;
         int maior = 0;

         do {
             System.out.println("Digite um número");
             num = sc.nextInt();  
             
            if (num > maior) {
                maior =num;
                System.out.println(num + " é maior que " + maior);
            } else {
                System.out.println(maior + " é maior que " + num);
            }
            media = media + num;
            contador++;
            
         } while (contador < 5);
            media = media/5;
            System.out.println("A média dos 5 números é: " + media);
         
    }
}
