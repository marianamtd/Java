package cursoemvideo.independente.flappybird;

public interface Jogo {
    String getTitulo();
    int getLargura();
    int getAltura();
    //pegar as teclas do teclado
    void tique(java.util.Set<String> teclas, double dt);
    void tecla(String tecla);
    void desenhar(Tela tela);
}
