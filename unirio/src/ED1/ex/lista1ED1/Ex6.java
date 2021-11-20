package ED1.ex.lista1ED1;

import java.util.Scanner;
import java.util.Stack;

public class Ex6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a frase: ");
        String frase = scanner.nextLine();

        fraseInvertida(frase);

        scanner.close();
    }

    public static void fraseInvertida(String frase){

        Stack<Character> stack = new Stack<>();
        char letra;

        for (int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            stack.push(letra);
        }

        for (int j = 0; j < frase.length(); j++ ){
            System.out.printf("%c", stack.peek());
            stack.pop();
        }
    }


    /*public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira a frase: ");
        String frase = scanner.nextLine();

        char letra, espaco = '\0';
        for (int i = 0; i < frase.length(); i++){
            letra = frase.charAt(i);
            stack.push(letra);
            //fazer a condição do espaço depois
        }

        for (int j = stack.size(); j > 0; j-- ){
            System.out.printf("%c", stack.peek());
            stack.pop();
        }
    }
    */

}
