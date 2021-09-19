package dojo.dojo3;

import java.util.Locale;

import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nome, email;
        int data_nasc, senha, telefone;
        long cpf;
        boolean entrar = false;

        int nrConta = random.nextInt(1000000000);

        while (nrConta < 100000000) {
            nrConta = random.nextInt(1000000000);
        }

        //input das informação dos clientes

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe seu CPF:");
        cpf = scanner.nextLong();

        System.out.println("Informe seu telefone: ");
        telefone = scanner.nextInt();

        System.out.println("Informe sua data de nascimento: ");
        data_nasc = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe seu email: ");
        email = scanner.nextLine();
        System.out.println("Informe sua senha: ");
        senha = scanner.nextInt();



        //menu
        for (; ; ) {

            System.out.println("\nBem vindo(a), " + nome);
            System.out.println("Conta: " + nrConta);
            System.out.println("Agência: 0001");
            System.out.println("1) Abrir conta Corrente");
            System.out.println("2) Abrir conta poupança");
            System.out.println("0) Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    return;
                case 1:
                    ContaCorrente corrente = new ContaCorrente(nome, email, data_nasc, senha, telefone, cpf, entrar);
                    boolean tem,naoTem; // NÃO ESQUECER DE FAZER ISSO AQUI!!!!!!!!!!!!!!!!!!!!!!!

                    //verificar se quer conta salario
                    System.out.println("Deseja fazer conta salário? [1 - Sim / 2 - Não]");
                    int resp = scanner.nextInt();
                    if (resp == 1) {
                        corrente.contaSalario();
                    }

                    //submenu
                    System.out.println();
                    System.out.println("--Conta Corrente--");
                    System.out.println("1) Realizar depósitos");
                    System.out.println("2) Realizar saque");
                    System.out.println("3) Cadastrar PIX");
                    System.out.println("4) Realizar transferência");
                    System.out.println("5) Pagar boleto");
                    System.out.println("6) Extrato ");
                    System.out.println("7) Conta Poupança");
                    System.out.println("8) Fazer Conta salário");
                    System.out.println("0) Sair");
                    int lerNr = scanner.nextInt();
                    while (lerNr != 0) {
                        if (lerNr == 1) {
                            corrente.deposito();
                        }
                        if (lerNr == 2) {
                            corrente.saque();
                        }
                        if (lerNr == 3) {
                            System.out.println("---PIX---");
                            System.out.println("Escolha uma chave");
                            System.out.println("1) E-mail");
                            System.out.println("2) Telefone");
                            System.out.println("3) CPF");
                            System.out.println("4) Chave Aleatória");
                            int chave = scanner.nextInt();

                            if (chave == 1 ) {
                                String senhapix = corrente.getEmail();
                                System.out.println(senhapix);
                            }
                            if (chave == 2) {
                                int senhapix = corrente.getTelefone();
                            }
                            if (chave == 3) {
                                long senhapix = corrente.getCpf();
                            }
                            if (chave == 4){
                                //num aleatório
                                int senhapix = random.nextInt(1000000000);

                                while (senhapix < 100000000) {
                                    senhapix = random.nextInt(1000000000);
                                }
                            }

                        }
                        if (lerNr == 4) {

                        }
                        if (lerNr == 5) {
                            corrente.pagarBoleto();
                        }
                        if (lerNr == 6) {
                            //extrato
                        }
                        if (lerNr == 7) {
                            //Manda pa Conta poupança

                        }
                        if (lerNr == 8) {
                            //extrato
                        }

                        System.out.println();
                        System.out.println("--Conta Corrente--");
                        System.out.println("1) Realizar depósitos");
                        System.out.println("2) Realizar saque");
                        System.out.println("3) Cadastrar PIX");
                        System.out.println("4) Realizar transferência");
                        System.out.println("5) Pagar boleto");
                        System.out.println("6) Extrato ");
                        System.out.println("7) Conta Poupança");
                        System.out.println("0) Sair");
                        lerNr = scanner.nextInt();

                    }
                    break;

                case 2:
                    ContaPoupanca poupanca = new ContaPoupanca(nome, email, data_nasc, senha, telefone, cpf, entrar);
                    scanner.nextLine();
                    System.out.println("Deseja fazer conta salário? (1 - Sim / 2 - Não)");
                    resp = scanner.nextInt();
                    if (resp == 1){
                        poupanca.contaSalario();
                    }
                    poupanca.getDateTime();
                    //submenu
                    System.out.println();
                    System.out.println("--Conta Poupança--");
                    System.out.println("1) Realizar depósitos");
                    System.out.println("2) Realizar saque");
                    System.out.println("3) Cadastrar PIX");
                    System.out.println("4) Realizar transferência");
                    System.out.println("5) Pagar boleto");
                    System.out.println("6) Extrato ");
                    System.out.println("7) Criar Conta Poupança");
                    System.out.println("0) Sair");
                    lerNr = scanner.nextInt();
                    while (lerNr != 0) {
                        if (lerNr == 1) {
                            poupanca.deposito();
                        }
                        if (lerNr == 2) {
                            poupanca.saque();
                        }
                        if (lerNr == 3) {
                            //esperando a luz
                        }
                        if (lerNr == 4) {

                        }
                        if (lerNr == 5) {
                            poupanca.pagarBoleto();
                        }
                        if (lerNr == 6) {
                        }

                        System.out.println("--Conta Poupança--");
                        System.out.println("1) Realizar depósitos");
                        System.out.println("2) Realizar saque");
                        System.out.println("3) Cadastrar PIX");
                        System.out.println("4) Realizar transferência");
                        System.out.println("5) Pagar boleto");
                        System.out.println("6) Extrato ");
                        System.out.println("7) Conta Corrente");
                        System.out.println("0) Sair");
                        lerNr = scanner.nextInt();
                    }
                    break;
            }
        }
    }
}

