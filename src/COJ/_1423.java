package COJ;

import java.util.Scanner;

public class _1423 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        double AB;
        double DE, a;
        String linea;
        
        linea = leer.next();
        
        while (!linea.isEmpty()) {
            
            AB = Double.parseDouble(linea);
            
            a = AB / 2;

            DE = a * Math.sqrt(3) / 4;

            System.out.printf("%.6f\n", DE);
            
            linea = leer.next();
        }
    }
}
