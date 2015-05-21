package COJ;

import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _3234 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int[] tickets_personas;

        int C, N;

        int contador, aux;

        while (true) {
            
            aux = 0;
            contador = 0;

            C = leer.nextInt();
            N = leer.nextInt();

            if (N == 0 && C == 0) {
                break;
            } else {
                tickets_personas = new int[N];
            }

            for (int i = 0; i < N; i++) {
                tickets_personas[i] = leer.nextInt();
            }
            
            for (int i = 0; i < tickets_personas.length; i++) {
                
                if (C >= tickets_personas[i]) {
                    C -= tickets_personas[i];
                    contador++;
                }
            }
            
            System.out.println(contador + " " + C);
            
            C = 0;
            N = 0;
        }

    }
}
