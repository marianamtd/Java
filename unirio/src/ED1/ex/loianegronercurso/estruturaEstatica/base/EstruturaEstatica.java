package ED1.ex.loianegronercurso.estruturaEstatica.base;

public class EstruturaEstatica <T>{
    protected T[] elementos;
    protected int tamanho;

    //constrututor
    @SuppressWarnings("unchecked")
    public EstruturaEstatica(int capacidade){
        this.elementos = (T[]) new Object[capacidade];  //dica do livro
        this.tamanho = 0;
    }

    //construtor sem parametros
    public EstruturaEstatica(){
        this(10);
    }

    public boolean estaVazia(){
        return this.tamanho == 0;
    }

    protected void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2]; //instanciando o novo vetor
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; //atribuir o antigo vetor ao q estamos trabalhando nessa classe
        }
    }

    protected boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    protected boolean adiciona(int posicao, T elemento) {
        //excepetion para verificar o elemento
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida!");
        }

        this.aumentaCapacidade();
        //logica para mover todos os elementos
        //precisa diminuir o tamanho do this.tamanho pq depois iria somar mais 1, por isso q o i recebe o tamanho - 1
        for (int i = this.tamanho - 1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        //agr precisa atribuir o elemento para a posição
        this.elementos[posicao] = elemento;  //elemento e posiçao q o usuário passou por parâmentro
        this.tamanho++;

        return true;
    }
    public int tamanho() {
        return this.tamanho;
    }

    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        s.append("["); //invés de utilizar o sinal de += utilizar o metodo append
        for (int i = 0; i < this.tamanho - 1; i++) {
            s.append(this.elementos[i]);
            s.append(",");
        }
        if (this.tamanho > 0) {
            s.append(this.elementos[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }


}
