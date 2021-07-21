package dojo;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Dojo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input do ano e qtd de dias
        System.out.println("Insira o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Insira o dia: ");
        int qtd_dias = scanner.nextInt();

        //verificar se ele é impar
        System.out.println("Paridade: " + (ano % 2 == 0 ? "Par" : "Ímpar"));
        //verificar se é bissexto
        System.out.println("Bissexto: " + (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) ? "true" : "false"));

        //pegar a data atual do pc
        Date data_pc = new Date();  //criar objeto para a data do pc
        SimpleDateFormat formatar = new SimpleDateFormat("y");   //criar outro objeto para fazer a manipulação da data
        String data_atual = formatar.format(data_pc);  //metodo format da classe SimpleDateFormat
        int data = Integer.parseInt(data_atual); // converte a String para Integer
        System.out.println("Distância: "+ (ano - Math.abs(data)));    // colocar a distância absoluta


    }
}
