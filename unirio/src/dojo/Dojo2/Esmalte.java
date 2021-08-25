package dojo.Dojo2;

public class Esmalte {
    //atritutos
    private String marca;
    private String textura;
    private String cor;
    private int carga;
    private boolean aberto;

    //metodos acessores
    public Esmalte(String marca, String textura, String cor, int carga) {
        this.setMarca(marca);
        this.setTextura(textura);
        this.setCor(cor);
        this.setCarga(carga);
        this.setAberto(false);  //começar com o esmalte fechado
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

   //metodos
    public void status() {
        System.out.println("------Esmalte------");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Textura: " + this.getTextura());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Carga: " + this.getCarga() + "%");
        if (this.isAberto()) {
            System.out.println("O esmalte está aberto.");
        }
        else {
            System.out.println("O esmalte está fechado.");
        }
        System.out.println();

    }
}
