package ED1.ex.lista1ED1;

import java.util.Scanner;

public class Ex2  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}

/*package ED1.ex.lista1ED1;

import java.util.Scanner;
import java.util.Stack;

public class EX5 {
    //constantes
    //usar na hora da verificação
    final static String ABRE = "({[";
    final static String FECHA =")}]";

    public static void main(String[] args) {
        System.out.println("Insira a expressão: ");
        Scanner scanner = new Scanner(System.in);
        String sequencia = scanner.nextLine();

        System.out.println(checkSimbolosBalanceados(sequencia));

    }

    public static boolean checkSimbolosBalanceados(String sequencia){
        boolean balanceado = true;
        Stack<Character> stack = new Stack<>(); //classe wraps

        char simbolo, topo;
        int i = 0;
        while (i < sequencia.length() && balanceado){
            simbolo = sequencia.charAt(i);

            if (ABRE.indexOf(simbolo) > - 1){   //push dos simbolos ({[
                stack.push(simbolo);
            }else if (FECHA.indexOf(simbolo) > - 1){
                //stack desbalanceada
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    topo = stack.pop();

                    //agr falta comp se os simb são ==
                    if (ABRE.indexOf(topo) != FECHA.indexOf(simbolo)){
                        return false;
                    }
                }
            }
            i++;
        }
        return true;
    }
}
*/