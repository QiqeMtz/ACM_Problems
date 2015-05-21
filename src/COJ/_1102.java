package COJ;

import java.math.BigInteger;
import java.util.Scanner;

public class _1102 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        BigInteger nCero = new BigInteger("0");
        BigInteger nOnce = new BigInteger("11");
        BigInteger numero;

        while (true) {
            numero = leer.nextBigInteger();

            if (numero.compareTo(nCero) == 0) {
                break;
            }

            if ((numero.mod(nOnce)).compareTo(nCero) == 0) {
                System.out.println(numero.toString() + " is a multiple of 11.");
            } else {
                System.out.println(numero.toString() + " is not a multiple of 11.");
            }
        }
    }
}
