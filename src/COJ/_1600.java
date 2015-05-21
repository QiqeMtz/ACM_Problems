package COJ;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1600 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        BigInteger M, N, Resultado;

        while(true){
            M = leer.nextBigInteger();
            N = leer.nextBigInteger();
            
            if(M.equals(BigInteger.ZERO) && N.equals(BigInteger.ZERO)){
                break;
            }
            
            Resultado = M.modPow(N, BigInteger.TEN);
            
            
            System.out.println(Resultado);
        }
    }
}
