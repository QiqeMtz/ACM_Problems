package COJ;

import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _1306 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int nCasos, num_aux;
        
        String numero;
        
        nCasos = leer.nextInt();
        
        for (int i = 0; i < nCasos; i++) {
            numero = leer.next();
            
            if(numero.length() <= 2){
                num_aux = Integer.parseInt(numero);
            } else{
                numero = "" + numero.charAt(numero.length()-2) + numero.charAt(numero.length()-1);
                num_aux = Integer.parseInt(numero);
            }
            
            if (num_aux % 4 == 0) {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
