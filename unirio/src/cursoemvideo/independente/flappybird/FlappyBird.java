package cursoemvideo.independente.flappybird;

import java.util.Set;

public class FlappyBird implements Jogo{

    @Override
    public String getTitulo() {
        return "Flappy Bird Aula";
    }

    @Override
    //300x168
    public int getLargura() {
        return 300;
    }

    @Override
    public int getAltura() {
        return 168;
    }

    @Override
    public void tique(Set<String> teclas, double dt) {

    }

    @Override
    public void tecla(String tecla) {

    }

    @Override
    public void desenhar(Tela tela) {
//        tela.imagem("flappybird-background.jpg", 0, 0, 88, 100, dir, x, y);
    }

    private static void roda() {
        new Motor(new FlappyBird());
    }

}
