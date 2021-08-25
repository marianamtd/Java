package dojo.Dojo2;

public class Shampoo {
    //atributos
    private String marca;
    private String modelo;
    private String tipoDeCabelo;
    private int tamanho;
    private boolean vegano;

    public void status() {
        System.out.println("------Shampoo------");
        System.out.println("Marca: " + this.getMarca());
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Tipo de cabelo: " + this.getTipoDeCabelo());
        System.out.println("Tamanho da embalagem: " + this.getTamanho() + "mL");
        if (this.isVegano())
            System.out.println("É um produto vegano");
        else
            System.out.println("Não é vegano! Cuidado");
        System.out.println();
    }

    //metodos acessores

    public Shampoo(String marca, String modelo, String tipoDeCabelo, int tamanho, boolean vegano) {
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setTipoDeCabelo(tipoDeCabelo);
        this.setTamanho(tamanho);
        this.setVegano(vegano);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipoDeCabelo() {
        return tipoDeCabelo;
    }

    public void setTipoDeCabelo(String tipoDeCabelo) {
        this.tipoDeCabelo = tipoDeCabelo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public boolean isVegano() {
        return vegano;
    }

    public void setVegano(boolean vegano) {
        this.vegano = vegano;
    }
}
