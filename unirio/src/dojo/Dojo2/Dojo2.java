package dojo.Dojo2;

import java.util.Scanner;

public class Dojo2 {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[10];
        Scanner scanner = new Scanner(System.in);
        int opcao, idade, matricula, qtd = 0;
        String nome;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("(1) Listar todos os alunos");
            System.out.println("(2) Adicionar um novo aluno");
            System.out.println("(3) Deletar aluno");
            System.out.println("(4) Ler atributos de um aluno");
            System.out.println("(5) Alterar a idade ");
            System.out.println("(0) Sair do programa");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

                    break;
                case 2:
                    System.out.println("Insira os dados (nome, matricula, idade)");
                    nome = scanner.nextLine();
                    matricula = scanner.nextInt();
                    idade = scanner.nextInt();
                    qtd++;
            }

        } while (opcao != 0);
    }
}
