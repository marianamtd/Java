package cursoemvideo.aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

        mamifero.setCorPelo("Amarelo com pintas marrons");
        mamifero.setIdade(5);
        mamifero.setPeso(112.67f);
        mamifero.setMembros(4);
        mamifero.locomover();
        mamifero.emitirSom();
        mamifero.alimentar();

        peixe.soltarBolha();
        ave.fazerNinho();

        Canguru canguru = new Canguru();
        Tartaruga tartaruga = new Tartaruga();
        Goldfish goldfish = new Goldfish();
        Arara arara = new Arara();
        Cachorro cachorro = new Cachorro();
        Cobra cobra = new Cobra();

        canguru.locomover();
        cachorro.locomover();
        cachorro.emitirSom();
        canguru.emitirSom();


    }
}
