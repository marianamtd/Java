package ED1.ex.loianegronercurso;

import java.util.Objects;

public class Contato {
    private String nome, telefone, email;

    //construtor com parametros


    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    //construtor sem parametros
    public Contato(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato)) return false;
        Contato contato = (Contato) o;
        return Objects.equals(getNome(), contato.getNome()) && Objects.equals(getTelefone(), contato.getTelefone()) && Objects.equals(getEmail(), contato.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getTelefone(), getEmail());
    }
}
