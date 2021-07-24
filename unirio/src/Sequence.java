import java.util.Scanner;

public class Sequence {
    public static void main (String[] args) {   //Método
        Scanner scanner = new Scanner(System.in);
        int qtd = 0;

        int num;
        while (true) {
            num = scanner.nextInt();
            num = num + num;
            System.out.println(num);
            if (num == 0) {
                break;
            }
            qtd ++;
        }


    }
}
