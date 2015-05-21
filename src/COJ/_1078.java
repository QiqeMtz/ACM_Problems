package COJ;


import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1078 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos = 0;
        
        int ninos = 0;
        
        int suma = 0;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            ninos = leer.nextInt();
            
            for (int j = 0; j < ninos; j++) {
                suma += leer.nextInt();
            }
            
            if (suma % ninos == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            suma = 0;
        }
    }
}
