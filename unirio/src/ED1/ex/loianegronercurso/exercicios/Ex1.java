package ED1.ex.loianegronercurso.exercicios;

import java.util.Scanner;
import java.util.Stack;

public class Ex1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner scanner = new Scanner(System.in);
        int i = 0;

        do{
            System.out.printf("Digite o %d numero:", i + 1);
            int numero = scanner.nextInt();

            if(numero % 2 == 0){
                stack.push(numero);
            }else{
                stack.pop();
            }
            if (stack.isEmpty()){
                System.out.println("Pilha vazia");
            }

            i++;
        }while(i != 10);
        System.out.println(stack);
    }
}
