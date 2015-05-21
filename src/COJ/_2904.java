package COJ;


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2904 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos;
        BigInteger suma = new BigInteger("0");
        BigInteger valor;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            valor = leer.nextBigInteger();
            suma = suma.add(valor);
        }
        
        System.out.println(suma);
    }
}
