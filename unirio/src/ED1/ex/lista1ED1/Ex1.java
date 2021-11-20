package ED1.ex.lista1ED1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10); //depois colocar para add sozinho

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma palavra: ");
        String palavra = scanner.nextLine();

        //pegar cada letra da palavra e da o push na pilha
        char letra;
        for (int i = 0; i < palavra.length(); i++){
            letra = palavra.charAt(i);
            pilha.empilha(letra);
        }
        System.out.print(pilha + " C ");

        while (!pilha.estaVazia()) {
            letra = pilha.desempilha();
            System.out.print(letra);

        }
        scanner.close();

    }
}
