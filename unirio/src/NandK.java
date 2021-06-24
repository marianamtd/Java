import java.util.Scanner;

public class NandK {
    public static void main(String[] args){
        //input das variáveis N e K
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para N: ");
        int n = scanner.nextInt();

        System.out.print("Digite um numero para K: ");
        int k = scanner.nextInt();

        //output
        System.out.println(k % n);

    }
}
