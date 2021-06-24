import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        //input
        Scanner scanner = new Scanner(System.in);
        int digit = scanner.nextInt();

        int centena = digit / 100;
        int dezena = (digit / 10) % 10;
        int unidade = digit % 10;
       System.out.printf("%d%d%d", unidade, dezena, centena);


    }
}
