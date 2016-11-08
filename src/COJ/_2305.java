package COJ.Java;


import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2305 {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        
        int nCasos;
        
        BigInteger res2;
        
        double A, B, C;
        double p;
        double res;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            A = leer.nextDouble();
            B = leer.nextDouble();
            C = leer.nextDouble();
            
            p = (A + B + C) / 2;
            
            //res = Math.sqrt(p * (p -A) * (p - B * (p - C)));
            res = Math.sqrt((p) * (p - C));
            
            res *= Math.sqrt((p - A) * (p - B));
            
            
            res *= 7;
            
            System.out.printf("%.1f\n", res);
        }
    }
}
