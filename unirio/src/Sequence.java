import java.util.Scanner;

public class Sequence {
    public static void main (String[] args) {   //Método
        Scanner scanner = new Scanner(System.in);
        int qtd = 0, soma = 0;

        int num;
        while (true) {
            num = scanner.nextInt();
            soma += num;
            if (num == 0) {
                break;
            }
            qtd ++;
        }
        System.out.println(soma);
    }
}
