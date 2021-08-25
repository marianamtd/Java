package dojo.Dojo2;

public class Livros {
    private String nome;
    private String autor;
    private int qtdPag;
    private String genero;
    private boolean novo;

    public void status() {
        System.out.println("------Livro------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Quantidade de páginas: " + this.getQtdPag());
        System.out.println("Gênero: " + this.getGenero());
        System.out.println("O livro é novo? " + this.isNovo());
        System.out.println();
    }

    //metodos acessores

    public Livros(String nome, String autor, int qtdPag, String genero, boolean novo) {
        this.setNome(nome);
        this.setAutor(autor);
        this.setQtdPag(qtdPag);
        this.setGenero(genero);
        this.setNovo(novo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean isNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }
}
