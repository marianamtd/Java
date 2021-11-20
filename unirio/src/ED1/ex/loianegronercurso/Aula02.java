package ED1.ex.loianegronercurso;

import java.util.ArrayList;
import java.util.Stack;

public class Aula02 {
    public static void main(String[] args) {

        /*Stack<Integer> stack = new Stack<Integer>();
        System.out.println(stack.isEmpty());
        stack.push(4);
        stack.push(13);
        stack.push(8);
        System.out.println(stack);
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack);*/




        /*Lista<String> vetoro = new Lista<>(3); //instanciando
        vetoro.adiciona("bolinho");*/
        ArrayList<String> vetoro = new ArrayList<>(3);
        vetoro.add("A");
        vetoro.add("B");
        vetoro.add("F");
        vetoro.add("C");
        vetoro.add("M");
        System.out.println(vetoro);
        vetoro.add(1,"C");
        boolean existe = vetoro.contains("A");
        if (existe){
            System.out.println("Existe no vetor");
        }
        else{
            System.out.println("elemento n existe");
        }
        System.out.println(vetoro);

        int pos = vetoro.indexOf("G");
        if (pos > -1 ){
            System.out.println("Existe no array " + pos);
        }else {
            System.out.println("Não existe no array " + pos);
        }

        System.out.println(vetoro.get(3));
        vetoro.remove("C");
        vetoro.add(2,"C");
        System.out.println(vetoro);
        vetoro.remove(4);
        System.out.println(vetoro + " Tamanho: " + vetoro.size());

    }
}