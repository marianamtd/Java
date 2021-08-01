package dojo;
import java.util.Scanner;

public class CompletoDojo2 {
    public static void main(String [] args ) {
        Scanner scanner = new Scanner(System.in);

        //criterio de avaliação
        System.out.println("Insira notas de avaliação (min direto, min passar pf, min passar final): ");
        float pd = scanner.nextFloat();
        while ( pd < 0 || pd > 10) {
            System.out.println("Insira novamente: ");
            pd = scanner.nextFloat();
        }

        float pf = scanner.nextFloat();
        while ( pf < 0 || pf > 10) {
            System.out.println("Insira novamente: ");
           pf = scanner.nextFloat();
        }
        float mf = scanner.nextFloat();
        while ( mf < 0 || mf > 10) {
            System.out.println("Insira novamente: ");
            mf = scanner.nextFloat();
        }


        //notas
        System.out.println("Insira as notas: ");
        float n1 = scanner.nextFloat();
        while ( n1 < 0 || n1 > 10) {
            System.out.println("Insira novamente: ");
            n1 = scanner.nextFloat();
        }

        float n2 = scanner.nextFloat();
        while ( n2 < 0 || n2 > 10) {
            System.out.println("Insira novamente: ");
            n2 = scanner.nextFloat();
        }
        float n3 = scanner.nextFloat();
        while ( n3 < 0 || n3 > 10) {
            System.out.println("Insira novamente: ");
            n3 = scanner.nextFloat();
        }

        float media = (n1 + n2 + n3)/3;

        float rec;
        if (media >= pf && media < pd) {
            System.out.println("Ficou de prova final");
            System.out.println("Insira nota da prova final: ");
            rec = scanner.nextFloat();

            float media_rec = (rec + media)/2;
            if (media_rec >= mf){
                System.out.println("Passou");
            }
            else {
                System.out.println("Não passou");
            }
        }
        else if ( media >= pd)
            System.out.println("Passou direto");
        else {
            System.out.println("Reprovou");
        }
    }
}
