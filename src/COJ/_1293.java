package COJ;


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1293 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int N;
        BigInteger dos = new BigInteger("2");
        BigInteger resultado;
        
        N = leer.nextInt();
        
        resultado = dos.pow(N);
        
        System.out.println(resultado);
    }
}
