import java.util.Scanner;

public class Zero {
    public static void main(String[] args){
        //declaração de variaveis
        int end = 0;

        //input do n
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        //condição de existencia
        if (0 <= n && n <= 1000000){
            end = ((n % 1000000 ) % 100) / 10;
            System.out.println(end);
        }
        else{
            System.out.println(end);
        }
    }
}
