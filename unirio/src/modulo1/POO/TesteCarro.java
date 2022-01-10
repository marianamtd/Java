package modulo1.POO;

public class TesteCarro {
    public static void main(String[] args) {
        Carro van = new Carro();

        Lampada lampada = new Lampada();
        lampada.ligada = false;
        lampada.ligar();
        lampada.mostrarEstado();
        lampada.desligar();
        lampada.mostrarEstado();
    }
}
