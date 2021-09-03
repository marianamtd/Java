package cursoemvideo.independente;

public class Profissional {
    String nomeProf, cargo;
    boolean disponivel;
    int horario;

    //construtor


    public Profissional(String nomeProf, String cargo) {
        this.nomeProf = nomeProf;
        this.cargo = cargo;
    }

    //metodos acessores

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }
}
