import java.util.Scanner;
public class Practice {
    public static void main (String[] args){
        //input da variável n
        System.out.print("Digite um número: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //output
        int total = ((n + 1) * n + 2) * n + 3;
        System.out.print(total);


    }
}
