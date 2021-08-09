package Bootcamp;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {
    }

    public Gato(String nome, String cor, Integer idade) {    //aperta alt + insert
        this.nome = nome;
        System.out.println("oi");
        this.cor = cor;
        this.idade = idade;
    }

    //para criar um arquivo, so apertar o pacote ou o scr e apertar as teclas alt + insert


    /*public String getNome() {   //aperta alt + insert
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }
*/
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public Integer getIdade() {
//        return idade;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }


}
