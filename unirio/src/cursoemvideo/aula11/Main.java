package cursoemvideo.aula11;

public class Main {
    public static void main(String[] args) {
        Visitante v1 = new Visitante();

        v1.setNome("Mila");
        v1.setIdade(23);
        v1.setSexo("Feminino");
        System.out.println(v1.detalhes());

        Aluno aluno1 = new Aluno();
        aluno1.setCurso("Biologia");
        aluno1.setNome("Bianca");
        aluno1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setNome("Marcio");
        b1.renovarBolsa();
    }
}
