import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a < b) {
            int qtd = 0;
            int media = 0;
            int i = a;
            for ( ; i <= b; i++) {
                if (i % 2 == 0) {
                    qtd++;
                    System.out.println(i);
                    media += i;
                }
            }
            System.out.println("Média = " + (media / qtd));
        }
        else{
            int aux = a;
            a = b;
            b = aux;
            int qtd = 0;
            int media = 0;
            int i = a;
            for ( ; i <= b; i++) {
                if (i % 2 == 0) {
                    qtd++;
                    System.out.println(i);
                    media += i;
                }
            }
            System.out.println("Média = " + (media / qtd));
        }
    }
}
