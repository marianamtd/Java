package dojo;
import java.util.Scanner;

public class Dojo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira as notas: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        if (media >= 7) {
            System.out.print("O aluno passou direto.");

        }else if (media > 4) {
            System.out.print("O aluno ficou de prova final.\n");
            System.out.print("Insira as notas: ");
            double prova_f = scanner.nextDouble();

            if ((prova_f + media) / 2 >= 5) {
                System.out.print("O aluno passou.");
            }
            else {
                System.out.print("O aluno reprovou.");
            }



        }else {
            System.out.print("O aluno reprovou.");
        }
    }
}
