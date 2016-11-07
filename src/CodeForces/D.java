package CodeForces;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * ====================================================================
 * || Project: ACM_Practicas
 * || Created by Enrique (QiqeMtz) on 06/11/16 at 18:19.
 * ====================================================================
 */

public class D {
    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);

        int N, M, casosPrueba;
        N = M = casosPrueba = 0;
        long T[] = new long[21];
        T[0] = 1;
        T[1] = 1;
        long resultado;
        List<String> valores = new ArrayList();

        //Calculo de los 20 factoriales
        for (int j = 2; j < 21; j++) {
            T[j] = T[j-1] * j;
        }

        try (BufferedReader br = new BufferedReader(new FileReader("popcorn.in")))
        {

            String sCurrentLine;
            casosPrueba = Integer.parseInt(br.readLine());

            for (int i = 0; i < casosPrueba; i++) {
                String arr[] = br.readLine().split(" ");
                N = Integer.parseInt(arr[0]);
                M = Integer.parseInt(arr[1]);

                resultado = T[N] / (T[M] * T[N-M]);

                System.out.println(resultado);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
