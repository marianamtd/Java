package cursoemvideo.aula6;

public class aula06 {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.ligar();
        controle.play();
        controle.ligarMudo();
        controle.desligarMudo();
        controle.pause();
        controle.abrirMenu();
        controle.fecharMenu();
        controle.desligar();
    }
}
