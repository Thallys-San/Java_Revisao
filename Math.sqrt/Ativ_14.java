package Math;

public class Atv14 {
    public static void main(String[] args) {
        double num = 50;
        double raizQuad = Math.sqrt(num);
        double resultado = Math.round(raizQuad * 100.0) / 100.0;

        System.out.println("A raiz quadrada de " + num + " é: " + resultado);
    }
}