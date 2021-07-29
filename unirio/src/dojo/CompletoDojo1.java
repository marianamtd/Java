package dojo;
import java.util.Scanner;

public class CompletoDojo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //input do ano e qtd de dias
        System.out.println("Insira o ano: ");
        int ano = scanner.nextInt();
        System.out.println("Insira o dia: ");
        int quant_dias = scanner.nextInt();

        //verificar se ele é impar
        //Acessando a pasta System
        System.out.println("Paridade: " + (ano % 2 == 0 ? "Par" : "Ímpar"));
        //verificar se é bissexto
        System.out.println("Bissexto: " + (((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) ? "true" : "false"));

        //verificar distancia
        int distancia = ano - 2021;

        if (distancia < 0)
            distancia *= -1;

        System.out.println("Distância = " + distancia);

        while(quant_dias > 360 || quant_dias <= 0){
            System.out.println("Dia inválido, insira-o novamente: ");
            quant_dias = scanner.nextInt();
        }

        int dia, mes;

        dia = quant_dias % 30;
        mes = quant_dias / 30 + 1;

        System.out.printf("%d / %d / %d\n", dia, mes, ano);

        System.out.println("Dias restantes: " + (360 - quant_dias));

    }
}
