import java.util.Scanner;

public class Triangles {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        System.out.print( a + b > c && a + c > b && b + c > a? "Yes":"NO");
    }
}
