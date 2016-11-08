package COJ.Java;

import java.util.Scanner;

public class _2413 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int nCasos;
        
        String numero;

        nCasos = leer.nextInt();

        while (nCasos-- != 0) {
            numero = leer.next();
            
            if (numero.charAt(numero.length() - 1) == '0' || numero.charAt(numero.length() - 1) == '5') {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }  
        }
    }
}
