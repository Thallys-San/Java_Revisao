package Math;

public class Ativ_17 {
    public static void main(String[] args) {

            double num = 0.001;
            double raizquadrada = Math.sqrt(num);
            double resultado = Math.round(raizquadrada * 100.0) / 100;

            System.out.println("A raiz quadrada de " + num + " É " + raizquadrada );
        }
    }