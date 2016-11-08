package COJ.Java;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2731 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos;
        double longitud, res;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            longitud = leer.nextDouble();
            
            res = (longitud * longitud) - (Math.PI * Math.pow(longitud/2, 2));
            
            System.out.printf("%.2f\n", res);
        }
    }
}
