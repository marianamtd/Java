package ED1.ex.loianegronercurso.estruturaEstatica.base;

public class Lista2<T> extends EstruturaEstatica<T>{

    //construtores
    public Lista2(){
        super();
    }
    public Lista2(int capacidade){
        super(capacidade);
    }

    //metodos


    @Override
    public boolean adiciona(T elemento) {
        return super.adiciona(elemento);
    }
    public boolean adiciona(int posicao, T elemento){
        return super.adiciona(posicao, elemento);
    }
}
