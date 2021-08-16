package cursoemvideo.aula2;

public class Aula2 {
    public static void main(String[] args) {
        Esmalte esmalte = new Esmalte(); //instanciar

        esmalte.cor = "verde";
        esmalte.carga = 98;
        esmalte.textura = "cremoso";
        esmalte.fechar();

        esmalte.status();
        esmalte.pintar();

        //instanciar segundo esmalte
        Esmalte esmalte1 = new Esmalte();
        esmalte1.marca = "Haskell";
        esmalte1.cor = "Beijo de menta";
        esmalte1.abrir();

        esmalte1.status();
        esmalte1.pintar();

    }
}
