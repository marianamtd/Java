package modulo1.POO;

public class Lampada {
    String marca, tipo, corLuz, voltagem;
    int potencia, tempCor;
    boolean ligada;

    void ligar(){
        ligada = true;
    }

    void desligar(){
        ligada = false;
    }

    void mostrarEstado(){
        if (ligada){
            System.out.println("Lampada está ligada");
        }else{
            System.out.println("Lampada desligada");
        }
    }

    void mudarEstado(){
        if(ligada){
            desligar();
        }else{
            ligar();
        }
    }

}
