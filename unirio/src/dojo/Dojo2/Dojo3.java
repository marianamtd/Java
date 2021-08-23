package dojo.Dojo2;

public class Dojo3 {
    public static void main(String[] args) {
        //instanciamento
        Pokemon pokemon = new Pokemon();

        pokemon.setNome("Charmander");
        pokemon.setTipo("Normal");
        pokemon.setPeso(6.5f);
        pokemon.setAltura(0.3f);
        pokemon.setChanceDeCaptura(20);
        pokemon.brincar();
        pokemon.brincar();
        pokemon.alimentar();
        pokemon.brincar();
        pokemon.alimentar();
        pokemon.statusAtual();
        pokemon.evoluir("Pikachu", "Evoluído", 90);
        pokemon.statusAtual();



    }
}
