package dojo;
import java.util.Scanner;

public class Dojo2 {

    static Comparable<String> alunoAprovado(double media) {
        return media < 4 ? "O aluno reprovou"
                : media < 7 ? "O aluno ficou de prova final"
                :"O aluno passou direto";
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double n1 = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        double n3 = scanner.nextDouble();
        double media = (n1 + n2 + n3) / 3;

        System.out.print(alunoAprovado(alunoAprovado(media)));


    }
}
