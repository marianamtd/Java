package modulo1.POO;

public class Carro {
    String marca, modelo;
    int numPassageiros;
    double capCombustivel, consumoCombustivel;

    public void exibirAutonomia(){ //qualquer lógica de prog
        System.out.println("A autonomia do carro é: " + obterAutonomia() + " km");
    }
    
    double obterAutonomia (){
        return capCombustivel * consumoCombustivel;
    }


}
