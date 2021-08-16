package cursoemvideo.aula2;

public class Esmalte {
        //atributos
        String cor;
        String marca;
        int carga;
        boolean aberto;
        String textura;

        //metodos
        void status() {
                System.out.println("Uma caneta " + this.cor);
                System.out.println("Marca: " + this.marca);
                System.out.println("Porcentagem da carga: " + this.carga);
                System.out.println("Está aberto? " + this.aberto);
                System.out.println("Qual a textura: " + this.textura);
        }

        void pintar(){
                /*if (this.aberto) {
                        System.out.println("Pode pintar, pois o esmalte está aberto");
                }
                else {
                        System.out.println("Não pode pintar, pois o frasco está fechado");
                }*/
                System.out.println(this.aberto? "Pode pintar, pois o esmalte está aberto" : "Não pode pintar, pois o frasco está fechado");
                System.out.println();

        }
        void fechar() {
                this.aberto = false;

        }
        void abrir() {
                this.aberto = true;

        }
}
