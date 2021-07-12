import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num_alunos = scanner.nextInt();

        //leitura das notas
        float notas, media = 0f;
        for (int i = 1; i <= num_alunos; i++ ){
            System.out.printf("Nota %d: ", i);
            notas = scanner.nextFloat();

            //soma de cada nota para fazer a média
            media += notas;
        }
        System.out.println("Media: " + (media / num_alunos));
    }
}
