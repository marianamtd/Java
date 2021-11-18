package cursoemvideo.aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        m.emitirSom();
        Lobo l = new Lobo();
        l.emitirSom();
        Cachorro c = new Cachorro();
        c.emitirSom();
        c.reagir(false);
        c.reagir(5,20);
        c.reagir("ola");
        c.reagir(12,19);
        //c.reagir(11,50);
        c.reagir(12,19.5f);
    }
}
