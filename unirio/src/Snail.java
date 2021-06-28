import java.util.Scanner;

public class Snail {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int poste = scanner.nextInt();
        int a = scanner.nextInt(); //quanto o snail sobe de dia
        int b = scanner.nextInt(); // quanto o snail desce de dia

        int dia = 1;
        int up = a;
        while (up < poste){
            dia++;
            up -= b;

            if(up < poste){
                up += a;
            }
        }
        System.out.println(dia);
    }
}
