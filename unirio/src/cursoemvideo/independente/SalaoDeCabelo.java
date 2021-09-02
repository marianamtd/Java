package cursoemvideo.independente;

public class SalaoDeCabelo {
    private String nomeCliente, nomeProfissional, endereco;
    private int horario;
    private double telefone;
    private double disponivel;

    //metodos
    public void pintarCabelo() {

    }

    public void cortarCabelo() {

    }

    public void imprimir() {
        System.out.println("Nome da Cliente: " + this.getNomeCliente());
        System.out.println("Nome do Profissional: " + this.getNomeProfissional());
        System.out.println("Horário: " + this.getHorario() / 100 + ":" + this.getHorario() % 100);
        System.out.println("Não esquecer os documentos para identificação");
        System.out.println("Por favor seguir os regulamentos do Covid-19");
        System.out.println("Não esqueça da máscara!");
        System.out.println();
    }


    //metodos acessores
    public SalaoDeCabelo(String nomeCliente, String nomeProfissional, String endereco, int horario, double telefone) {
        this.nomeCliente = nomeCliente;
        this.nomeProfissional = nomeProfissional;
        this.endereco = endereco;
        this.horario = horario;
        this.telefone = telefone;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getNomeProfissional() {
        return nomeProfissional;
    }

    public void setNomeProfissional(String nomeProfissional) {
        this.nomeProfissional = nomeProfissional;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getTelefone() {
        return telefone;
    }

    public void setTelefone(double telefone) {
        this.telefone = telefone;
    }
}
