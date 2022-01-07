package modulo1.arrays;

import java.util.Scanner;

public class Exer18Aula19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] idades = new int[10];

        for(int i = 0; i < idades.length; i++){
            idades[i] = scanner.nextInt();
        }

        int menor = idades[0], indexMenor = 0, maior = idades[0], indexMaior = 0;
        for(int i = 1; i < idades.length; i++){
            if (idades[i] > maior ){
                maior = idades[i];
                indexMaior = i;
            }else if( idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.println("Menor idade: " + menor + " na pos " + indexMenor);
        System.out.println("Maior idade: " + maior + " na pos " + indexMaior);
        
        System.out.print("Vetor A = [");
        for(int var: idades){
            System.out.print(var + " ");
        }
        System.out.print("]");
    }
}
