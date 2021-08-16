package cursoemvideo.aula3;

public class Esmalte {

        //atributos
        public String cor;
        public String marca;
        private int carga;
        private boolean aberto;
        public String textura;

        //metodos
        public void status() {
            System.out.println("Um esmalte na cor " + this.cor);
            System.out.println("Marca: " + this.marca);
            System.out.println("Porcentagem da carga: " + this.carga);
            System.out.println("Está aberto? " + this.aberto);
            System.out.println("Qual a textura: " + this.textura);
        }

        public void pintar(){
                /*if (this.aberto) {
                        System.out.println("Pode pintar, pois o esmalte está aberto");
                }
                else {
                        System.out.println("Não pode pintar, pois o frasco está fechado");
                }*/
            System.out.println(this.aberto? "Pode pintar, pois o esmalte está aberto" : "Não pode pintar, pois o frasco está fechado");
            System.out.println();

        }
        public void fechar() {
            this.aberto = false;

        }
        public void abrir() {
            this.aberto = true;

        }
}
