package cursoemvideo.aula12;

public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha() {
        System.out.println("°");
        System.out.println("°°");
        System.out.println("Soltando bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe não faz som");
    }
}
