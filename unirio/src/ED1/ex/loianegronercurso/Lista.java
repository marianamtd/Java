package ED1.ex.loianegronercurso;

import java.lang.reflect.Array;

public class Lista<T>{
    private T[] elementos;
    private int tamanho;

    public Lista(int capacidade) {
        this.elementos = (T[]) new Object[capacidade];
        this.tamanho = 0;
    }

    //metodo para add
  /*public void adiciona(String elemento){
    for(int i = 0; i <this.elementos.length; i++){
      if(this.elementos[i] == null){
        this.elementos[i] = elemento;
        System.out.print(elemento);
        break;
      }
    }
  }
  public void adiciona(String elemento) throws Exception{

    if(this.tamanho < this.elementos.length){
      //add o elemento na posição tamanho
      this.elementos[this.tamanho] = elemento;
      this.tamanho++;  //incrementa o tamanho
    }
    else{
      throw new Exception("O vetor já está cheio!");
    }
  }*/

    //privado pq só é utilizado internamente
    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            T[] elementosNovos = (T[])new Object[this.elementos.length * 2]; //instanciando o novo vetor
            for (int i = 0; i < this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos; //atribuir o antigo vetor ao q estamos trabalhando nessa classe
        }
    }

    public boolean adiciona(T elemento) {
        this.aumentaCapacidade();
        if (this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public boolean adiciona(int posicao, T elemento) {
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

    //B G D E F --> tamanho 5
    //0 1 2 3 4 --> tirar o B da pos 0
    //vetor[0] == vetor[1]
    public void remove(int posicao){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = posicao; i <this.tamanho-1; i++){
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;

    }


    //busca usando excepction
    public Object busca(int posicao) throws IllegalArgumentException{
        if(!(posicao >= 0 && posicao < tamanho)){ //quando a gente nega essa expressão, temos o range de todas as opções q n podem ser acessadas
            //Illegal..Excep.. é utilizado para tipos de argumentos q são inválidos
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public boolean contem(T elemento){
        return busca(elemento) > -1; //>= 0
    }

    public int busca(T elemento) {
        for (int i = 0; i < this.tamanho; i++) {
            if (this.elementos[i].equals(elemento)) {
                return i;
            }
        }
        return -1;
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
