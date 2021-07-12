import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int aluno = 0;
        float max = 0, min = 0, media = 0, nota;
        do {
            System.out.printf("Nota: ");
            nota = scanner.nextFloat();
            media += nota;
            if (nota != -1) {
                aluno++;

                min = nota;
                //ver qual é a maior nota
                if (nota > max){
                    max = nota;
                }
                //qual é a menor nota
                if (nota < min)
                    min = nota;
            }

        }
        while(nota != -1);
        System.out.printf("Qtd de alunos: %d\n", aluno);
        System.out.printf("Nota max: %.1f\n", max);
        System.out.printf("Nota min: %.1f\n", min);
        System.out.printf("Média: %.1f\n", media / aluno);
    }
}
