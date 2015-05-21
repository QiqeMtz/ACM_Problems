package COJ;


import java.util.Scanner;

public class _2876 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double a, b;

        double resultado;

        a = leer.nextDouble();
        b = leer.nextDouble();

        resultado = a * b;

        resultado = resultado + Math.PI;

        resultado = resultado + ((2 * (a * 1)) + (2 * (b * 1)));


        System.out.printf("%.3f\n", resultado);

    }
}