package Dojo3;
import java.util.Calendar;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String nome, email;
        int senha, telefone, i = 0;
        long cpf;
        boolean entrar = false;
        boolean temCC = false;
        boolean temCP = false;

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int mesAtual = Calendar.getInstance().get(Calendar.MONTH) + 1;
        int diaAtual = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        System.out.printf("Dia: %d, Mes: %d, Ano: %d\n", diaAtual, mesAtual, anoAtual);

        //int[] dataAtual = {diaAtual, mesAtual, diaAtual};

        int nrConta = random.nextInt(1000000000);

        while (nrConta < 100000000) {
            nrConta = random.nextInt(1000000000);
        }

        Conta[] contas = new Conta[2];

        //input das informação dos clientes

        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Informe seu CPF:");
        cpf = scanner.nextLong();

        System.out.println("Informe seu telefone: ");
        telefone = scanner.nextInt();

        System.out.println("Informe sua data de nascimento: ");
        System.out.println("Dia:");
        int diaNasc = scanner.nextInt();
        System.out.println("Mes:");
        int mesNasc = scanner.nextInt();
        System.out.println("Ano:");
        int anoNasc = scanner.nextInt();

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
            System.out.println("1) Conta corrente");
            System.out.println("2) Conta poupança");
            System.out.println("3) Ver contas");
            System.out.println("4) Avançar tempo em 1 mês");
            System.out.println("0) Sair");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 0:
                    return;
                case 1:
                    if (!temCC){
                        System.out.println("Criando conta corrente...");
                        ContaCorrente corrente = new ContaCorrente(nome, email, diaNasc, mesNasc, anoNasc, senha, telefone, cpf, entrar, 0);
                        contas[i] = corrente;
                        i++;
                        temCC = true;
                        System.out.println("Conta corrente criada!");
                    }
                    //submenu
                    System.out.println();
                    System.out.println("\n--Conta Corrente--\n");
                    System.out.println("1) Realizar depósitos");
                    System.out.println("2) Realizar saque");
                    System.out.println("3) Cadastrar PIX");
                    System.out.println("4) Realizar transferência para conta poupança");
                    System.out.println("5) Pagar boleto");
                    System.out.println("6) Extrato ");
                    System.out.println("7) Fazer Conta salário");
                    System.out.println("0) Voltar para o menú principal");
                    int lerNr = scanner.nextInt();
                    while (lerNr != 0) {
                        if (lerNr == 1) {
                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc){
                                    cc.deposito();
                                }
                            }
                        }
                        if (lerNr == 2) {
                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc){
                                    cc.saque();
                                }
                            }
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
                                for (Conta c: contas){
                                    if (c instanceof ContaCorrente cc){
                                        String senhapix = cc.getEmail();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }

                            }
                            if (chave == 2) {
                                for (Conta c: contas){
                                    if (c instanceof ContaCorrente cc){
                                        int senhapix = cc.getTelefone();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }
                            }
                            if (chave == 3) {
                                for (Conta c: contas){
                                    if (c instanceof ContaCorrente cc){
                                        long senhapix = cc.getCpf();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }
                            }
                            if (chave == 4){
                                //num aleatório
                                int senhapix = random.nextInt(1000000000);

                                while (senhapix < 100000000) {
                                    senhapix = random.nextInt(1000000000);
                                }
                                System.out.println("Sua senha pix é: " + senhapix);
                            }

                        }
                        if (lerNr == 4) {
                            System.out.println("Quanto será transferido?");
                            int transfC = scanner.nextInt();

                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc) {
                                    cc.setSaldoCC(cc.getSaldo() - transfC);
                                    System.out.printf("saldo atual: R$%.2f\n", cc.getSaldoCC());
                                }
                            }
                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc){
                                    cc.setSaldoCC(cc.getSaldo() - transfC);
                                    System.out.printf("saldo atual: R$%.2f\n",cc.getSaldoCC());
                                }


                            }
                        }
                        if (lerNr == 5) {
                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc){
                                    cc.pagarBoleto();
                                }
                            }
                        }
                        if (lerNr == 6) {
                            System.out.println("Extrato");
                        }
                        if (lerNr == 7) {
                            for (Conta c: contas){
                                if (c instanceof ContaCorrente cc) {
                                    if (!cc.entrar) {
                                        cc.ContaSalario();
                                    }
                                    else {
                                        System.out.println("\nVoce ja possui conta salario!\n ");
                                    }
                                    entrar = true ;
                                }
                            }
                        }
                        System.out.println("\n--Conta Corrente--\n");
                        System.out.println("1) Realizar depósitos");
                        System.out.println("2) Realizar saque");
                        System.out.println("3) Cadastrar PIX");
                        System.out.println("4) Realizar transferência para conta poupança");
                        System.out.println("5) Pagar boleto");
                        System.out.println("6) Extrato ");
                        System.out.println("7) Fazer Conta salário");
                        System.out.println("0) Voltar para o menu principal");
                        lerNr = scanner.nextInt();
                    }
                    break;

                case 2:
                    if (!temCP){
                        System.out.println("Criando conta poupança...");
                        ContaPoupanca poupanca = new ContaPoupanca(nome, email, diaNasc, mesNasc, anoNasc, senha, telefone, cpf, entrar, 0, diaAtual, mesAtual);
                        contas[i] = poupanca;
                        i++;
                        temCP = true;
                        System.out.println("Conta poupança criada!");

                    }
                    //submenu
                    System.out.println("\n--Conta Poupança--\n");
                    System.out.println("1) Realizar depósitos");
                    System.out.println("2) Realizar saque");
                    System.out.println("3) Cadastrar PIX");
                    System.out.println("4) Realizar transferência para conta corrente");
                    System.out.println("5) Pagar boleto");
                    System.out.println("6) Extrato ");
                    System.out.println("7) Fazer Conta salário");
                    System.out.println("0) Voltar para o menu principal");
                    lerNr = scanner.nextInt();
                    while (lerNr != 0) {
                        if (lerNr == 1) {
                            for (Conta c: contas){
                                if (c instanceof ContaPoupanca cp){
                                    cp.deposito();
                                }
                            }
                        }
                        if (lerNr == 2) {
                            for (Conta c: contas){
                                if (c instanceof ContaPoupanca cp){
                                    cp.saque();
                                }
                            }
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
                                for (Conta c: contas){
                                    if (c instanceof ContaPoupanca cp){
                                        String senhapix = cp.getEmail();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }
                            }
                            if (chave == 2) {
                                for (Conta c: contas){
                                    if (c instanceof ContaPoupanca cp){
                                        int senhapix = cp.getTelefone();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }
                            }
                            if (chave == 3) {
                                for (Conta c: contas){
                                    if (c instanceof ContaPoupanca cp){
                                        long senhapix = cp.getCpf();
                                        System.out.println("Sua senha pix é: " + senhapix);
                                    }
                                }
                            }
                            if (chave == 4){
                                //num aleatório
                                int senhapix = random.nextInt(1000000000);

                                while (senhapix < 100000000) {
                                    senhapix = random.nextInt(1000000000);
                                }
                                System.out.println("Sua senha pix é: " + senhapix);
                            }
                        }
                        if (lerNr == 4) {
                            System.out.println("Fazer!!");

                        }
                        if (lerNr == 5) {
                            for (Conta c: contas){
                                if (c instanceof ContaPoupanca cp){
                                    cp.pagarBoleto();
                                }
                            }
                        }
                        if (lerNr == 6) {
                            System.out.println("Extrato");

                        }
                        if (lerNr == 7) {
                            for (Conta c: contas){
                                if (c instanceof ContaPoupanca cp) {
                                    if (!cp.entrar) {
                                        cp.ContaSalario();
                                    }
                                    else {
                                        System.out.println("\nVoce ja possui conta salario!\n ");
                                    }
                                    entrar = true ;
                                }
                            }
                        }

                        System.out.println("\n--Conta Poupança--\n");
                        System.out.println("1) Realizar depósitos");
                        System.out.println("2) Realizar saque");
                        System.out.println("3) Cadastrar PIX");
                        System.out.println("4) Realizar transferência para conta corrente");
                        System.out.println("5) Pagar boleto");
                        System.out.println("6) Extrato ");
                        System.out.println("7) Fazer Conta salário");
                        System.out.println("0) Voltar para o menú principal");
                        lerNr = scanner.nextInt();
                    }
                    break;

                case 3:
                    if (!temCC & !temCP)
                        System.out.println("Você não tem contas!");
                    else {
                        System.out.printf("Usuário:\nNome: %s / CPF: %d / Email: %s / Telefone: %d / Data de nascimento: %d/%d/%d", nome, cpf, email, telefone, diaNasc,mesNasc,anoNasc);
                        Conta.imprimir(contas);
                    }
                    break;

                case 4:
                    int[] dataNova = Tempo.avancar(diaAtual, mesAtual, anoAtual);
                    mesAtual = dataNova[1];
                    for (int j = 0; j < dataNova.length; j++){
                        if (j == 0)
                            System.out.println("Dia atualizado: " + dataNova[0]);
                        if (j == 1)
                            System.out.println("Mês atualizado: " + dataNova[1]);
                        if (j == 2)
                            System.out.println("Ano atualizado: " + dataNova[2]);
                    }
                    for (Conta c: contas){
                        if (c instanceof ContaPoupanca cp){
                            cp.renderSaldo(diaAtual, mesAtual);
                        }
                    }
            }
        }
    }
}
