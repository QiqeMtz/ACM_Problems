package COJ.Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _2851 {

    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        int a, b, p_Ent, resto, primerResto, cociente = 0, i;
        int long_Periodo, sumatoria = 0, sumatoria_Periodo = 0, sumatoria_Final = 0, total = 0, cifra = 0;
        int[] restos, enteros;
        long c;
        int inicio_Periodo = 0;
        String periodo = "";
        String parte_ent = "";
        boolean flag = false;

        while (true) {
            long_Periodo = inicio_Periodo = sumatoria = sumatoria_Periodo = sumatoria_Final = total = 0;
            periodo = parte_ent = "";
            //String arr[] = cin.readLine().split(" ");
            a = leer.nextInt();
            b = leer.nextInt();
            c = leer.nextLong();
            cifra = 0;
            i = 0;
            p_Ent = 0;
            resto = 0;

            restos = new int[b];
            enteros = new int[b];

            p_Ent = a / b;
            parte_ent = String.valueOf(p_Ent);

            resto = a % b;
            primerResto = resto;
            restos[resto] = 1;

            if (resto == 0) {
                sumatoria = 0;
                if (c <= parte_ent.length()) {
                    for (int j = 0; j < c; j++) {
                        sumatoria += parte_ent.charAt(j) - 48;
                    }
                    total = sumatoria;
                }
            } else {

                cociente = (10 * resto) / b;
                resto = (10 * resto) % b;

                enteros[i] = cociente;
                i++;

                while (restos[resto] == 0) {

                    restos[resto] = i + 1;
                    cociente = (10 * resto) / b;
                    enteros[i] = cociente;
                    resto = (10 * resto) % b;
                    i++;
                }
                //if (restos[resto] != 0) {
                inicio_Periodo = restos[resto];
                long_Periodo = i - inicio_Periodo + 1;
                //break;
                //} else {
                restos[resto] = i;
                periodo += String.valueOf(cociente);

            }

            for (int j = 0; j < inicio_Periodo - 1; j++) {
                parte_ent += String.valueOf(enteros[j]);
            }

            sumatoria = 0;
            if (c <= parte_ent.length()) {
                for (int j = 0; j < c && j < parte_ent.length(); j++) {
                    sumatoria += parte_ent.charAt(j) - 48;
                }

                cifra = parte_ent.charAt((int) c - 1) - 48;

                total = sumatoria;
            } else {
                c = c - parte_ent.length();
                for (int j = 0; j < parte_ent.length(); j++) {
                    sumatoria += parte_ent.charAt(j) - 48;
                }

                sumatoria_Periodo = 0;
                for (int j = (inicio_Periodo - 1); j < (inicio_Periodo-1) + long_Periodo; j++) {
                    sumatoria_Periodo += enteros[j];
                }

                p_Ent = (int) c / long_Periodo;
                resto = (int) c % long_Periodo;

                sumatoria_Final = 0;
                for (int j = inicio_Periodo-1; j < inicio_Periodo - 1 + resto; j++) {
                    sumatoria_Final += enteros[j];
                }

                total = sumatoria + (sumatoria_Periodo * p_Ent) + sumatoria_Final;
                
                //CIFRA
                //cifra = enteros[inicio_Periodo + resto-2];
                
                if (resto == 0) {
                    cifra = enteros[i-1];
                } else {
                    cifra = enteros[inicio_Periodo + resto-2];
                }
                
            }

            System.out.println(total + " " + cifra);
        }

    }
    //out.close();
}
