package cursoemvideo.aula9;

import java.util.Random;

public class Livro implements Publicacao {
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    //metodos especiais

    public String detalhes() {
        return "Livro{" +
                " titulo = '" + titulo + '\'' +
                ",\n autor = '" + autor + '\'' +
                ",\n totPaginas = " + totPaginas +
                ",  pagAtual = " + pagAtual +
                ",\n aberto = " + aberto +
                ",\n leitor = " + leitor.getNome() +
                ",  idade = " + leitor.getIdade() +
                ",  sexo = " + leitor.getSexo() +
                '}';
    }

    //metoodos acessores

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.setAberto(false);
        this.pagAtual = 0;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    //implementar os metodos abstratos
    @Override
    public void abrir() {
        this.setAberto(true);

    }

    @Override
    public void fechar() {
        this.setAberto(false);

    }

    @Override
    public void folhear(int p) {
        if (p <= getTotPaginas() && p > 0)
            this.pagAtual = p;
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(getPagAtual() + 1);
        //this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }
}
