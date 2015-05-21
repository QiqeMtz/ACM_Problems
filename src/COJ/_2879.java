package COJ;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2879 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        BigInteger MCD = new BigInteger("0");
        BigInteger MCM = new BigInteger("0");
        
        int nCasos = 0;

        nCasos = leer.nextInt();

        for (int i = 0; i < nCasos; i++) {
            MCD = leer.nextBigInteger();

            MCM = leer.nextBigInteger();

            if (MCM.mod(MCD).compareTo(BigInteger.ZERO) == 0) {
                System.out.println(MCD + " " + MCM);
            } else {
                System.out.println("-1");
            }
        }
    }
}
