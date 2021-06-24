import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        //input
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        //condição de existencia
        if (100 <= digit && digit <= 999){
            int centena = digit / 100;
            int dezena = (digit % 100) / 10 ;
            int unidade = (digit % 100) % 10;
            System.out.println(centena + dezena + unidade);
        }
    }

}
