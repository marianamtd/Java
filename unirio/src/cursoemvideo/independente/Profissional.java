package cursoemvideo.independente;

public class Profissional {
    String nomeProf;
    boolean disponivel;
    int horario;

    //construtor
    public Profissional() {
        setDisponivel(true);
    }

    //metodos acessores


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
