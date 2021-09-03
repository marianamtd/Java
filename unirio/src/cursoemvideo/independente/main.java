package cursoemvideo.independente;

import java.util.Locale;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //declaração das variáveis
        String nomeCliente, nomeProf, endereco;
        int horario, opcao;
        double telefone;
        boolean iscliente;

        //ver qual será o sistema (Profional ou Cliente)
        System.out.println("Digite somente true ou false");
        System.out.println("É cliente? ");
        iscliente = scanner.nextBoolean();

        //entrar no switch case se for cliente
        if (iscliente) {
            do {
                System.out.println("------MENU------");
                System.out.println("1 - Cortar Cabelo");
                System.out.println("2 - Pintar cabelo");
                System.out.println("3 - Unha");
                System.out.println("4 - Depilação");
                System.out.println("5 - Sair do sistema ");

                System.out.println();
                System.out.println("Escolha uma opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); //limpar o buffer

                switch (opcao) {
                    case 1:
                        System.out.println("Informe suas informações:");
                        System.out.println("Nome Completo:");
                        nomeCliente = scanner.nextLine().toUpperCase(Locale.ROOT);


                        System.out.println("Endereço: ");
                        endereco = scanner.nextLine().toUpperCase(Locale.ROOT);

                        System.out.println("Telefone: ");
                        telefone = scanner.nextDouble();

                        System.out.println("Informe agora o horário e o nome do profissional:");
                        System.out.println("Horário (sem espaços)");
                        horario = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer do teclado

                        System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                        nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);

                        //quando o usuário digitar que NÃO SABE qual profissional tem no salão
                        if (nomeProf.equals("NS")) {
                            do {
                                System.out.println("---Lista dos Cabelereiros---");
                                System.out.println("Fábio Moreira");
                                System.out.println("Thaís Amaral");
                                System.out.println("Claúdio Villas");
                                System.out.println("Bianca Peixoto");
                                System.out.println("Marcela Santos");
                                System.out.println("NS - Não sei");

                                System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                                nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);
                            } while (nomeProf.equals("NS"));

                        }
                        SalaoDeCabelo corte = new SalaoDeCabelo(nomeCliente, nomeProf, endereco, horario, telefone);
                        corte.cortarCabelo();
                        corte.imprimir();
                        break;

                    case 2:
                        System.out.println("Informe suas informações:");
                        System.out.println("Nome Completo:");
                        nomeCliente = scanner.nextLine().toUpperCase(Locale.ROOT);

                        System.out.println("Endereço: ");
                        endereco = scanner.nextLine().toUpperCase(Locale.ROOT);

                        System.out.println("Telefone: ");
                        telefone = scanner.nextDouble();

                        System.out.println("Informe agora o horário e o nome do profissional:");
                        System.out.println("Horário (sem espaços)");
                        horario = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer

                        System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                        nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);

                        //quando o usuário digitar que NÃO SABE qual profissional tem no salão
                        if (nomeProf.equals("NS")) {
                            do {
                                System.out.println("---Lista dos Cabelereiros---");
                                System.out.println("Fábio Moreira");
                                System.out.println("Thaís Amaral");
                                System.out.println("Claúdio Villas");
                                System.out.println("Bianca Peixoto");
                                System.out.println("Marcela Santos");
                                System.out.println("NS - Não sei");

                                System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                                nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);
                            } while (nomeProf.equals("NS"));

                            SalaoDeCabelo pintar = new SalaoDeCabelo(nomeCliente, nomeProf, endereco, horario, telefone);
                            pintar.pintarCabelo();
                            pintar.imprimir();
                        }
                        break;

                    case 3:
                        System.out.println("Informe suas informações:");
                        System.out.println("Nome Completo:");
                        nomeCliente = scanner.nextLine().toUpperCase(Locale.ROOT);


                        System.out.println("Endereço: ");
                        endereco = scanner.nextLine().toUpperCase(Locale.ROOT);

                        System.out.println("Telefone: ");
                        telefone = scanner.nextDouble();

                        System.out.println("Informe agora o horário e o nome do profissional:");
                        System.out.println("Horário (sem espaços)");
                        horario = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer do teclado

                        System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                        nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);

                        //quando o usuário digitar que NÃO SABE qual profissional tem no salão
                        if (nomeProf.equals("NS")) {
                            do {
                                System.out.println("---Lista de Manicures---");
                                System.out.println("Michele Mendes");
                                System.out.println("Pedro Fernandes");
                                System.out.println("Marcia Abreu");
                                System.out.println("Luciona Peixoto");
                                System.out.println("Renata Santos");
                                System.out.println("NS - Não sei");

                                System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                                nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);
                            } while (nomeProf.equals("NS"));
                        }
                        SalaoDeCabelo unha = new SalaoDeCabelo(nomeCliente, nomeProf, endereco, horario, telefone);
                        unha.pintarUnha();
                        unha.imprimir();
                        break;

                    case 4:

                        System.out.println("Informe suas informações:");
                        System.out.println("Nome Completo:");
                        nomeCliente = scanner.nextLine().toUpperCase(Locale.ROOT);


                        System.out.println("Endereço: ");
                        endereco = scanner.nextLine().toUpperCase(Locale.ROOT);

                        System.out.println("Telefone: ");
                        telefone = scanner.nextDouble();

                        System.out.println("Informe agora o horário e o nome do profissional:");
                        System.out.println("Horário (sem espaços)");
                        horario = scanner.nextInt();
                        scanner.nextLine(); //limpar o buffer do teclado

                        System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                        nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);

                        //quando o usuário digitar que NÃO SABE qual profissional tem no salão
                        if (nomeProf.equals("NS")) {
                            do {
                                System.out.println("---Lista de Depiladores---");
                                System.out.println("Carla Simone");
                                System.out.println("Maiara Pereira");
                                System.out.println("Victor Roberto");
                                System.out.println("Eduarda Rodrigues");
                                System.out.println("Brenda Neves");
                                System.out.println("NS - Não sei");

                                System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                                nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);
                            } while (nomeProf.equals("NS"));
                        }
                        SalaoDeCabelo depilacao = new SalaoDeCabelo(nomeCliente, nomeProf, endereco, horario, telefone);
                        depilacao.marcarDepilacao();
                        depilacao.imprimir();
                        break;

                    case 5:
                        return;
                }
            } while (opcao != 5);
        }
        else {
            Profissional profissional = new Profissional();
        }
    }
}
