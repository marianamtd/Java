package cursoemvideo.aula13;

public class Mamifero extends Animal{
    protected String corDoPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorDoPelo() {
        return corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }
}
