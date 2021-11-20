package ED1.ex.loianegronercurso.estruturaEstatica.pilha;

public class Aula13 {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(3);
        pilha.empilha(8);
        System.out.println(pilha);
        System.out.println("Desempinhando: " + pilha.desempilha());
        System.out.println(pilha);




    }
}
