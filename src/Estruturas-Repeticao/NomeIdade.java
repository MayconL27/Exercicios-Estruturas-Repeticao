import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {
        /**Faça um programa que leia conjuntos de dois valores, 
         * o primeiro representando o nome do aluno e o segundo 
         * representando a sua idade.
         * (Pare o programa inserindo o valor 0 no campo nome)
         */

        Scanner sc = new Scanner(System.in);
        boolean rodando= true;

        while (rodando) {
            System.out.println("Digite a opção");
            System.out.println("1 - Inserir nome e idade do aluno.");
            System.out.println("0 - Sair.");
            int opcao = sc.nextInt();

           switch (opcao) {
                case 1:
                System.out.println("Digite o nome do aluno:");
                String nome = sc.nextLine();
                System.out.println("Digite a idade do aluno:");
                int idade = sc.nextInt();

                System.out.println("Nome do aluno: " + nome);
                System.out.println("Nome do Idade: " + idade);
    
                break;
                case 0:
                    rodando = false;
                    System.out.println("Programa encerrado!");
                    break;
                default:
                   break;
           }           
        }       
    }
}
