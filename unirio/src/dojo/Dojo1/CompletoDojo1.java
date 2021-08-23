package Dojo1;
import java.util.Scanner;

public class CompletoDojo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o ano");
        int ano = scanner.nextInt();
        System.out.println("Insira dia: ");
        int qtd_dia = scanner.nextInt();

        //verificar a qtd de dias
        while (qtd_dia > 360 || qtd_dia <= 0) {
            System.out.println("Dia inválido, insira novamente: ");
            qtd_dia = scanner.nextInt();
        }


        //verificar a paridade
        System.out.println("Paridade: " + ((ano % 2 == 0)? "Par" : "Ímpar"));

        //verificar bissexto
        System.out.println("Bissexto: " + ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)? "True" : "False"));

        //distancia
        int distancia = ano - 2021;

        if (distancia < 0)
            distancia *= -1;
        System.out.println("Distancia: " + distancia);

        int dia, mes;

        dia = qtd_dia % 30;
        mes = qtd_dia / 30 + 1;

        System.out.printf("%d/%d/%d\n", dia, mes, ano);
        System.out.println("Dias restante: " + (360 - qtd_dia));

    }
}

