public class StandardMath {
    public static void main(String[] args) {
        //retorna o numero absoluto
        double absoluto = -10.98;
        System.out.println(Math.abs(absoluto));

        //raizes
        double raiz_quadrada = Math.sqrt(2);
        double raiz_cubica = Math.cbrt(27.0);
        System.out.println(raiz_quadrada);
        System.out.println(raiz_cubica);

        //minimo e maximo
        int min = Math.min(11, 14);
        int max = Math.max(11, 14);
        System.out.println(min);
        System.out.println(max);

        //trigonometria
        double pi = Math.PI;
        System.out.println(pi);
        double seno = Math.sin(pi/2);
        System.out.println(seno);
        double cos = Math.cos(pi);
        System.out.println(cos);

        //aleatório
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        // aproximação
        double piso = Math.floor(3.78);
        double teto = Math.ceil(4.15);
        System.out.println(piso);
        System.out.println(teto);
    }
}
