import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /** Desenvolva um gerador de tabuada, capaz de gerar 
         * a tabuada de qualquer número inteiro entre 1 a 10.
         * O usuário deve informar de qual número ele deseja 
         * a tabuada. A saída deve ser conforme o ezemplo abaixo:
         * Tabuada de 5:
         * 5 x 1 = 5
         * 5 x 2 = 10
         * ...
         */

         Scanner sc = new Scanner(System.in);

         System.out.println("Digite o número que deseja a tabuada:");
         int num = sc.nextInt();

         System.out.println("Tabuada de " + num);

         for (int i=1;i<=10;i++) {
             int resultado = num * i;
             System.out.println(num + " X " + i + " = " + resultado);
         }

    }
}
