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


        do {
            System.out.println("------MENU------");
            System.out.println("1 - Cortar Cabelo");
            System.out.println("2 - Pintar cabelo");
            System.out.println("3 - Unha");
            System.out.println("4 - Depilação");
            System.out.println("5 - Área Restrita");
            System.out.println("6 - Sair do sistema ");

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
                            System.out.println("Fabio Moreira");
                            System.out.println("Thais Amaral");
                            System.out.println("Claudio Villas");
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

                    System.out.println("Nome do profissional [NS para ver a lista dos profissionais]: ");
                    nomeProf = scanner.nextLine().toUpperCase(Locale.ROOT);
                    scanner.nextLine(); //limpar o buffer do teclado

                    //quando o usuário digitar que NÃO SABE qual profissional tem no salão
                    if (nomeProf.equals("NS")) {
                        do {
                            System.out.println("---Lista de Manicures---");
                            System.out.println("Michele Mendes");
                            System.out.println("Pedro Fernandes");
                            System.out.println("Marcia Abreu");
                            System.out.println("Luciana Peixoto");
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
                    System.out.println("----Área Restrita a Profissionais do Salão----");
                    Profissional[] profissionals = new Profissional[15];
                    profissionals[0] = new Profissional("Fabio Moreira", "cabelereiro");
                    profissionals[1] = new Profissional("Thais Amaral", "cabeleiro");
                    profissionals[2] = new Profissional("Claudio Villas", "cabeleiro");
                    profissionals[3] = new Profissional("Bianca Peixoto", "cabeleiro");
                    profissionals[4] = new Profissional("Marcela Santos", "cabeleiro");
                    profissionals[5] = new Profissional("Michele Mendes", "manicure");
                    profissionals[6] = new Profissional("Pedro Fernandes", "manicure");
                    profissionals[7] = new Profissional("Marcia Abreu", "manicure");
                    profissionals[8] = new Profissional("Luciana Peixoto", "manicure");
                    profissionals[9] = new Profissional("Renata Santos", "manicure");
                    profissionals[10] = new Profissional("Carla Simone", "depilador");
                    profissionals[11] = new Profissional("Maiara Pereira", "depilador");
                    profissionals[12] = new Profissional("Victor Roberto", "depilador");
                    profissionals[13] = new Profissional("Eduarda Rodrigues", "depilador");
                    profissionals[14] = new Profissional("Brenda Neves", "depilador");

                    System.out.println("Informe seu nome:");

                    nomeProf = scanner.nextLine();
                    //percorrer o vetor para ver se o nome informado é o msm do sistema
//                    for(int i = 0; i < 15; i++) {
//                        if (profissionals[i].nomeProf.equals(nomeProf)) {
//                            System.out.println("Nome correto!");
//                            System.out.println("Digite a senha: ");
//                            String senha = scanner.nextLine();
//
//                            if (senha.equals("entrar")) {
//                                //chamar metodo para marcar cliente
//                                System.out.println("Caregando...");
//                            }
//                        }
//                    }
                    break;

                case 6:
                    return;
            }
        } while (opcao != 5);
    }
}
