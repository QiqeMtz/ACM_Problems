package COJ;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author EnriqueJM
 */
public class _3259 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        int N = 0, M = 0;
        char[][] matriz;
        int ind_izq = 0;
        int ind_der = 0;
        int ind_sup = 0;
        int ind_inf = 0;
        int contador = 0;

        N = leer.nextInt(); //Fila
        M = leer.nextInt(); //Columnas

        matriz = new char[N][];

        for (int fila = 0; fila < N; fila++) {
            matriz[fila] = leer.next().toCharArray();

        }
        
        //System.out.println(Arrays.toString(matriz));

        //Buscar indice izquierdo
        for (int columna = 0; columna < M; columna++) {
            for (int fila = 0; fila < N; fila++) {
                if (matriz[fila][columna] == '1') {
                    ind_izq = columna;
                    break;
                }
            }
            break;
        }

        //Buscar indice derecho
        for (int columna = M - 1; columna >= 0; columna--) {
            for (int fila = 0; fila < N; fila++) {
                if (matriz[fila][columna] == '1') {
                    ind_der = columna;
                    break;
                }
            }
            break;
        }

        //Buscar fila superior
        for (int fila = 0; fila < N; fila++) {
            for (int columna = 0; columna < M; columna++) {
                if (matriz[fila][columna] == '1') {
                    ind_sup = fila;
                    break;
                }
            }
            break;
        }

        //Buscar fila inferior
        for (int fila = N - 1; fila >= 0; fila--) {
            for (int columna = 0; columna < M; columna++) {
                if (matriz[fila][columna] == '1') {
                    ind_inf = fila;
                    break;
                }
            }
            break;
        }

        contador = ind_der + 1 - ind_izq;
        contador += ind_inf + 1 - ind_sup;
        contador += ind_der + 1 - ind_izq;
        contador += ind_inf + 1 - ind_sup;

        System.out.println(contador);
    }
}
