package ED1.ex.loianegronercurso.exercicios;

import ED1.ex.loianegronercurso.estruturaEstatica.pilha.Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();

        int num, i = 0;
        while (i < 10){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Número: ");
            num = scanner.nextInt();

            if(num % 2 == 0){
                if (num == 0){
                    if ((!pilhaPar.isEmpty()) || (!pilhaImpar.isEmpty()) ){    //verifica se pode tirar
                        pilhaImpar.pop();
                        pilhaPar.pop();
                    }else {
                        System.out.println("Pilha vazia");
                    }
                }
                else {
                    pilhaPar.push(num);   //add elemento na pilha par
                }
            }else{
                pilhaImpar.push(num);
            }
            i++;
        }
        System.out.println(pilhaImpar + "\n" + pilhaPar);

        //desempilhar os elementos
        for (i = pilhaImpar.size(); i > 0; i-- ){
            System.out.printf("Elemento %d desempilhando \n", pilhaImpar.peek());
            pilhaImpar.pop();
        }
        System.out.println("-----------");
        for (i = pilhaPar.size(); i > 0; i-- ){
            System.out.printf("Elemento %d desempilhando \n", pilhaPar.peek());
            pilhaPar.pop();
        }
    }
}
