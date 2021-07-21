package dojo;
import java.util.Scanner;

public class Dojo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //critérios de avaliação do usuário
        System.out.print("Insira as notas de avaliação(mínima para passar direto, mínima para fazer prova final, e mínima para passar na média final)\n");
        double direto = scanner.nextDouble();
        double min_prova_f = scanner.nextDouble();
        double min_media_f = scanner.nextDouble();

        System.out.print("Insira as notas: ");
        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        //passou pela media já estipulada ou pelo novo critério
        if (media >= 7 || media >= direto) {
            System.out.print("O aluno passou direto.");

        }else if (media > 4 || media >= min_prova_f) {
            System.out.print("O aluno ficou de prova final.\n");
            System.out.print("Insira as notas: ");
            double prova_f = scanner.nextDouble();

            if ((prova_f + media) / 2 >= 5 || media >= min_media_f) {  //verifica se passou na prova final
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
