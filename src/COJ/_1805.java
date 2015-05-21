package COJ;


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1805 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        BigInteger A, B, Resultado;
        
        A = leer.nextBigInteger();
        B = leer.nextBigInteger();
        
        Resultado = (A.add(B)).add(A.subtract(B)).add((B.add(A))).add((B.subtract(A)));
        
        System.out.println(Resultado);
    }
}
