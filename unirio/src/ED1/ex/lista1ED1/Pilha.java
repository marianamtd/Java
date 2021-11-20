package ED1.ex.lista1ED1;

import java.util.Arrays;

public class Pilha {
    private int tamanho, topo;
    private char[] elementos;

    //construtores
    public Pilha(int capacidade){
        this.elementos = new char[capacidade];
        this.topo = -1;
        tamanho = capacidade;
    }
    //sem parâmetro
    public Pilha(){
        tamanho = 10;
        elementos = new char[tamanho];
        topo = -1;
    }

    public boolean estaVazia(){
        if (this.topo == -1){
            return true;
        }
        return false;
    }
    public boolean estaCheia(){
        if (this.topo == tamanho--){
            return true;
        }
        return false;
    }

    public boolean empilha(char elemento){
        if (!this.estaCheia()){
            elementos[++topo] = elemento;
            return true;
        }
        System.out.println("Pilha cheia!");
        return false;
    }

    public char desempilha(){
       char letra = '\0'; //indica o final da pilha

        //verificar condição
        if (!this.estaVazia()){
            letra = elementos[topo--];
        }

        return letra;
    }


    public char retornaTopo()
    {
        char elemento = '\0';

        if(!this.estaVazia())
        {
            elemento = elementos[topo];
        }
        else
        {
            System.out.println("Pilha vazia.");
        }

        return elemento;
    }


    @Override
    public String toString() {

        StringBuilder s = new StringBuilder();
        //invés de utilizar o sinal de += utilizar o metodo append
        for (int i = 0; i < this.topo; i++) {
            s.append(this.elementos[i]);
        }
        if (this.topo > 0) {
            s.append(this.elementos[this.topo]);
        }

        return s.toString();
    }
}
