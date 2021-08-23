package dojo.Dojo2;

public class Dojo3 {
    public static void main(String[] args) {
        //instanciamento
        Pokemon pokemon = new Pokemon();

        pokemon.setNome("Charmander");
        pokemon.setTipo("Normal");
        pokemon.setPeso(6.5f);
        pokemon.setAltura(0.3f);
        pokemon.setFelicidade(85);
        pokemon.setChanceDeCaptura(99);
        pokemon.statusAtual();
        pokemon.falar();

    }
}
